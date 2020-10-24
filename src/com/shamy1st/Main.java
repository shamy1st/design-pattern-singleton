package com.shamy1st;

import com.shamy1st.singleton.SingleObject;

public class Main {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
