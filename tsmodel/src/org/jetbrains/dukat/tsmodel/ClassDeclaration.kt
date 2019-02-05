package org.jetbrains.dukat.tsmodel

import org.jetbrains.dukat.astCommon.MemberDeclaration

data class ClassDeclaration(
        override val name: String,
        val members: List<MemberDeclaration>,
        override val typeParameters: List<TypeParameterDeclaration>,
        val parentEntities: List<HeritageClauseDeclaration>,
        val modifiers: List<ModifierDeclaration>,
        val uid: String
) : ClassLikeDeclaration
