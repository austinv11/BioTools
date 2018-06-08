# BioTools
Requirements to develop:
Install the `Grammar-Kit`, `PsiViewer` plugins.

Recompiling grammars:

For each grammar, enter the .bnf file and right click to `Generate Parser Code` and `Generate JFlex Lexer`

These should be in the gen directory in the root of the repo. And ensure that the lexer is in the appropriate package.

Then open the generated .flex files, and for each right click to `Run JFlex Generator`.

This is kinda tedious, but the Grammar-Kit gradle plugin is not fully implemented yet.

Testing:

Simply run the `runIde` task and create a new project to play around in.

.bnf files also allow you to create live preview on right click to test grammar rules
on the fly.
