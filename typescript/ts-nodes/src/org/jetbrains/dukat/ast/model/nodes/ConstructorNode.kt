package org.jetbrains.dukat.ast.model.nodes

data class ConstructorNode(
        override val parameters: List<ParameterNode>,
        val typeParameters: List<TypeValueNode>
) : MemberNode, ParameterOwnerNode