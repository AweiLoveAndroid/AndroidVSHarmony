//index.js
//获取应用实例
const app = getApp()

Page({
  data: {
   dataArr: ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday']
  },
  onLoad: function () {
    wx.setNavigationBarTitle({
      title: '微信小程序Demo3'
    })
  }
})
