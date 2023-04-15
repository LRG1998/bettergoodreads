<script lang="ts">
    import { onMount } from "svelte";
    import PrismaClient from '@prisma/client'
        onMount(()=>{
    async function getBooks(){
        const res = await fetch('$/prisma')
        console.log(res)

    }
    getBooks();
})


    
</script>