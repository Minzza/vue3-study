<template>
  <v-container
      fluid
  >
    <v-card class="pa-3">
      <v-row justify="start">
        <v-col cols="auto">
          <v-card class="pa-3" outlined>
            Col
          </v-card>
        </v-col>
        <v-col cols="auto">
          <v-card class="pa-3" outlined>
            Col
          </v-card>
        </v-col>
        <v-col cols="auto">
          <v-card class="pa-3" outlined>
            Col
          </v-card>
        </v-col>
      </v-row>
      <v-row :style="{height: '120px'}"
        class="red"
        align="start">
        <v-col align-self="start">
          <v-card class="pa-3" outlined>
            Col
          </v-card>
        </v-col>

        <v-col>
          <v-card class="pa-3" outlined>
            Col
          </v-card>
        </v-col>
        <v-col>
          <v-card class="pa-3" outlined>
            Col
          </v-card>
        </v-col>
      </v-row>
    </v-card>
  </v-container>
</template>

<script>
export default {}
</script>

<style scoped>

</style>