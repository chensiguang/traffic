package com.web.action.tree;

public class TreeBuild {
	private String open = "0";
	private String im0 = "book.gif";
	private String im1 = "books_open.gif";
	private String im2 = "books_close.gif";
	private StringBuffer sb = null;
	private boolean showRoot = true;// 是否显示根节点

	public void addToTree(Tree tree, String id, String name, String pid) {
		// 表示第一个节点
		if (tree.getId().equals("")) {
			tree.setId(id);
			tree.setName(name);
		} else {
			// 传入节点的父亲id等于该节点的id
			if (tree.getId().equals(pid)) {
				Tree child = new Tree();
				child.setId(id);
				child.setName(name);
				tree.getChildList().add(child);// 添加一个节点
			} else {
				// 查找
				for (Tree t : tree.getChildList()) {
					addToTree(t, id, name, pid);
				}
			}
		}
	}

	public String treeToXml(Tree tree) {
		sb = new StringBuffer();
		sb.append("<tree id =\"0\">");
		build(tree);
		sb.append("</tree>");
		return sb.toString();
	}

	private void build(Tree tree) {
		if (tree.getChildList().size() == 0) {
			sb.append("<item text=\"" + tree.getName() + "\"");
			sb.append(" id=\"" + tree.getId() + "\"");
			sb.append(" open=\"" + open + "\"");
			sb.append(" im0=\"" + im0 + "\"");
			sb.append(" im1=\"" + im1 + "\"");
			sb.append(" im2=\"" + im2 + "\"");
			sb.append("></item>");
		} else {
			sb.append("<item text=\"" + tree.getName() + "\"");
			sb.append(" id=\"" + tree.getId() + "\"");
			sb.append(" open=\"" + open + "\"");
			sb.append(" im0=\"" + im0 + "\"");
			sb.append(" im1=\"" + im1 + "\"");
			sb.append(" im2=\"" + im2 + "\"");
			sb.append(">");
			for (Tree t : tree.getChildList()) {
				build(t);
			}
			sb.append("</item>");
		}
	}

	public String getIm0() {
		return im0;
	}

	public void setIm0(String im0) {
		this.im0 = im0;
	}

	public String getIm1() {
		return im1;
	}

	public void setIm1(String im1) {
		this.im1 = im1;
	}

	public String getIm2() {
		return im2;
	}

	public void setIm2(String im2) {
		this.im2 = im2;
	}

	public void setShowRoot(boolean showRoot) {
		this.showRoot = showRoot;
	}

}
