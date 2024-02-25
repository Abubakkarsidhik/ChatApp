package com.example.chatwithme.domain.usecase.chatScreen

import com.example.chatwithme.domain.repository.ChatScreenRepository

class DeleteMessageInFirebase(
    private val chatScreenRepository: ChatScreenRepository
) {
    suspend operator fun invoke(
        chatRoomUUID:String,
        messageContent:String
    ) = chatScreenRepository.deleteMessageInUserFirebase(
        chatRoomUUID,
        messageContent
    )
}