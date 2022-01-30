# Program Structure Interface
程序结构接口,通常称为PSI,是IntelliJ Platform中的一个层,负责解析文件并创建支持平台许多功能的语法和语义代码模型.
## 背景知识: VFS, Document

## PSI 文件、FVP与元素
## PSI 导航与引用

## PSI 修改与保存

The PsiFileFactory createFileFromText() method creates an in-memory PSI file with the specified contents.
To save the PSI file to disk, use the PsiDirectory add() method
## PSI 结构