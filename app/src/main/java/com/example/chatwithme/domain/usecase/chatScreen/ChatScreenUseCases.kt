package com.example.chatwithme.domain.usecase.chatScreen

data class ChatScreenUseCases(
    val blockFriendToFirebase: BlockFriendToFirebase,
    val insertMessageToFirebase: InsertMessageToFirebase,
    val deleteMessageInFirebase:DeleteMessageInFirebase,
    val loadMessageFromFirebase: LoadMessageFromFirebase,
    val opponentProfileFromFirebase: LoadOpponentProfileFromFirebase
)