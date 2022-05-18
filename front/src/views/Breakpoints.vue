<template>
  <v-container>
    <v-card>
      <v-card-title>
        $vuetity.breakpoint.name: {{ $vuetify.breakpoint.name }}
      </v-card-title>
      <v-container>
        <v-card class="pa-3"
        outlined :height="200">
          콘텐츠
        </v-card>
      </v-container>
    </v-card>
  </v-container>
</template>

<script>
export default {
  computed: {
    height() {
      switch (this.$vuetify.breakpoint.name) {
        case "xs":return 100
        case "sm":return 200
        case "md":return 300
        case "lg":return 400
        default: return 500

      }
    }
  }
}
</script>

<style scoped>

</style>