package br.gov.sedurb.util;

import java.util.ArrayList;
import java.util.List;

public class TreeItem {
    private String _text = null;
    private List<TreeItem> _children = null;

    public TreeItem(String text) {
        setText(text);
    }

    public String getText() {
        return _text;
    }

    public void setText(String text) {
        this._text = text;
    }

    public List<TreeItem> getChildren() {
        if (_children == null) {
            _children = new ArrayList<TreeItem>();
        }
        return _children;
    }

    public void setChildren(List<TreeItem> children) {
        this._children = children;
    }
    
    public void addChildren(TreeItem child) {
        getChildren().add(child);
    }
}
