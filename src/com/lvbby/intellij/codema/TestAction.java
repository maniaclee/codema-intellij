package com.lvbby.intellij.codema;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;

/**
 * Created by lipeng on 17/4/1.
 */
public class TestAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Application application = ApplicationManager.getApplication();
        CodemaApplicationComponent component = application.getComponent(CodemaApplicationComponent.class);
        component.hello();
    }
}
