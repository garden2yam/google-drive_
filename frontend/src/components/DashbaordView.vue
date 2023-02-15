<template>

    <v-data-table
        :headers="headers"
        :items="dashbaord"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'DashbaordView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "fileName", value: "fileName" },
                { text: "fileSize", value: "fileSize" },
                { text: "isIndexed", value: "isIndexed" },
                { text: "isUploaded", value: "isUploaded" },
                { text: "videoUrl", value: "videoUrl" },
            ],
            dashbaord : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/dashbaords'))

            temp.data._embedded.dashbaords.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.dashbaord = temp.data._embedded.dashbaords;
        },
        methods: {
        }
    }
</script>

