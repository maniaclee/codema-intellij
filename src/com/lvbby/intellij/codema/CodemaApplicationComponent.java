package com.lvbby.intellij.codema;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

/**
 * Created by lipeng on 17/4/1.
 */
public class CodemaApplicationComponent implements ApplicationComponent {
    public CodemaApplicationComponent() {
    }

    @Override
    public void initComponent() {
        // TODO: insert component initialization logic here
    }

    @Override
    public void disposeComponent() {
        // TODO: insert component disposal logic here
    }

    @Override
    @NotNull
    public String getComponentName() {
        return "CodemaApplicationComponent";
    }

    public void hello(){
        Messages.showMessageDialog("hello, plugin", "hello", Messages.getInformationIcon());
    }
}
