package com.asdhammu.cspdrogon.language.psi;

import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo;
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerProvider;
import com.intellij.codeInsight.navigation.NavigationGutterIconBuilder;
import com.intellij.icons.AllIcons;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.psi.search.GlobalSearchScope;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class CSPDrogonViewLineMarkerProvider extends RelatedItemLineMarkerProvider {

    @Override
    protected void collectNavigationMarkers(@NotNull PsiElement element, @NotNull Collection<? super RelatedItemLineMarkerInfo<?>> result) {

        if (element.getNode().getElementType() == CSPDrogonTypes.VIEW_FILE_PATH) {
            PsiElement parent = element.getParent();

            if (parent instanceof CSPDrogonViewFilePath) {

                Project project = element.getProject();
                String fileName = element.getText();

                Collection<VirtualFile> files = FilenameIndex.getVirtualFilesByName(
                        fileName,
                        GlobalSearchScope.allScope(project)
                );

                if (!files.isEmpty()) {
                    VirtualFile virtualFile = files.iterator().next();
                    PsiFile psiFile = PsiManager.getInstance(project).findFile(virtualFile);
                    NavigationGutterIconBuilder<PsiElement> builder = NavigationGutterIconBuilder.create(AllIcons.Actions.Forward)
                            .setTargets(psiFile)
                            .setTooltipText("Navigate to " + fileName);
                    result.add(builder.createLineMarkerInfo(element));
                }
            }


        }
    }
}
