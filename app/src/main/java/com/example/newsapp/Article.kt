package com.example.newsapp

import com.google.gson.annotations.SerializedName

data class Article(
    @SerializedName("author") val authorName:String,
    @SerializedName("title") val titleText:String,
    @SerializedName("description") val descText:String,
    @SerializedName("url") val articleUrl:String,
    @SerializedName("urlToImage") val imageUrl:String,
)
/*
{
-"source": {
"id": null,
"name": "CoinDesk"
},
"author": "Shaurya Malwa",
"title": "AzukiDAO Votes on 'Reclaim' of 20K Ether After Botched Elementals NFT Mint - CoinDesk",
"description": "“We have only been given a similar profile picture to that of the original Azuki holders,” the DAO proposal reads.",
"url": "https://www.coindesk.com/web3/2023/07/03/azukidao-votes-on-reclaim-of-20k-ether-after-botched-elementals-nft-mint/",
"urlToImage": "https://www.coindesk.com/resizer/2W1R2ywZ6pEfDxSHXB_UM4QvkoY=/1200x628/center/middle/cloudfront-us-east-1.images.arcpublishing.com/coindesk/S3SVKJ7AHZH3NNA2NM74M25YLI.png",
"publishedAt": "2023-07-03T07:46:00Z",
"content": "A group of holders of Azuki non-fungible tokens (NFTs) is voting for the return of nearly 20,000 ether a week after the Elementals NFT mint, citing reasons ranging from disappointment with the collec… [+2481 chars]"
}
 */
