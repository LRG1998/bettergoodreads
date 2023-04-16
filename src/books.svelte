<script lang="ts">
    import { onMount } from "svelte";
        onMount(()=>{
    async function getBooks(){
        const res = await fetch('prisma/dev.sqlite')
        await Promise
        console.log(res)
    }
    getBooks();
})   
</script>