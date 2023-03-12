module.exports = {
  devServer: {
    proxy: {
      '/report/*': {
        target: 'http://localhost:8080',
        ws: true,
        changeOrigin: true
      }
    }
  }
}
