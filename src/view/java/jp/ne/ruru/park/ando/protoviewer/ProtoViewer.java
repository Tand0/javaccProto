package jp.ne.ruru.park.ando.protoviewer;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.IntStream;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import jp.ne.ruru.park.ando.protoviewer.tree.ASTInput;
import jp.ne.ruru.park.ando.protoviewer.tree.ProtoParser;
import jp.ne.ruru.park.ando.protoviewer.tree.ParseException;
import jp.ne.ruru.park.ando.protoviewer.tree.SimpleNode;
import jp.ne.ruru.park.ando.protoviewer.tree.Token;

/** ASN.1 viewer
 */
@SuppressWarnings("serial")
public final class ProtoViewer extends JPanel {
	/** base folder */
	private static final File BASE_FOLDER = new File("./proto");
    /** main
     * @param argc argc string list
     */
    public static final void main(String [] argc) {
        //
        SwingUtilities.invokeLater(()->{
            JFrame owner = new JFrame("Proto viewer");
            owner.getContentPane().setLayout(new GridLayout(1,1));
            owner.getContentPane().add(new ProtoViewer());
            owner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            owner.setSize(512 , 700);
            owner.setVisible(true);
        });
    }
    /**
     * Contractor
     */
    public ProtoViewer() {
        //
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("baseDir=" + BASE_FOLDER.getAbsolutePath());
        DefaultTreeModel model = new DefaultTreeModel(root);
        this.tree = new JTree(model);
        this.tree.addTreeSelectionListener(e->this.actionTree(e));
        //
        JScrollPane scroll = new JScrollPane(this.tree);
        this.setLayout(new BorderLayout());
        this.add(scroll,BorderLayout.CENTER);
    }
    /**
     * action tree
     * @param e tree selection event
     */
    protected void actionTree(TreeSelectionEvent e) {
        //
        TreePath ps = e.getPath();
        Object obj = ps.getLastPathComponent();
        if (!(obj instanceof DefaultMutableTreeNode)) {
            return;
        }
        final DefaultMutableTreeNode dNode = (DefaultMutableTreeNode)obj;
        Object userObject = dNode.getUserObject();
        if (userObject instanceof String) {
            if (dNode.getChildCount() <= 0) {
                File[] folders = BASE_FOLDER.listFiles();
                if (folders != null) {
                	Arrays.asList(folders).stream()
                    	.forEachOrdered(
                            target->dNode.add(new DefaultMutableTreeNode(target)));
                }
            }
            return;
        } else if (userObject instanceof File) {
            File target = (File)userObject;
            try (InputStream in = new FileInputStream(target)) {
            	ProtoParser parser = new ProtoParser(in);
                ASTInput start = parser.Input();
                dNode.add(new SimpleMutableTreeNode(start));
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (ParseException e1) {
                e1.printStackTrace();
            }
        } else {
            SimpleNode data = (SimpleNode)userObject;
            if (dNode.getChildCount() <= 0) {
                IntStream.range(0, data.jjtGetNumChildren())
                .mapToObj(i->data.jjtGetChild(i))
                .forEachOrdered(
                    dataChild->dNode.add(new SimpleMutableTreeNode(dataChild)));
            }
        }
    }
    /**
     * node image
     */
    protected class SimpleMutableTreeNode extends DefaultMutableTreeNode {
    	/**
    	 * Contractor
    	 * @param node user object
    	 */
        public SimpleMutableTreeNode(Object node) {
            super(node);
        }
        public String toString() {
            String ans = this.getUserObject().toString();
            if (this.getUserObject() instanceof SimpleNode) {
                SimpleNode simpleNode = (SimpleNode)this.getUserObject();
                Token token = (Token)simpleNode.jjtGetValue();
                if ((token != null) && (token.image != null)) {
                    String image = token.image;
                    if (100 < image.length()) {;
                    	image = image.substring(0,100);
                    }
                    ans = ans + "(" + image + ")";
                }
            }
            return ans;
        }
    }
    /** tree */
    private final JTree tree;
}
