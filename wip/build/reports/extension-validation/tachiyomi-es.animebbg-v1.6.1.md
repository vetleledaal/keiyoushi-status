# Extension Validation Report

- Extension: tachiyomi-es.animebbg-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6594879625133134594
- Source name: AnimeBbg
- Source language: es
- Selected manga input: popular offset 0: Ore no Wakuchin dake ga Zombie shita Sekai wo Sukueru (`.../ore-no-wakuchin-dake-ga-zombie-shita-sekai-wo-sukueru.4324`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Ore no Wakuchin dake ga Zombie shita Sekai wo Sukueru (`.../ore-no-wakuchin-dake-ga-zombie-shita-sekai-wo-sukueru.4324`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | En un mundo de castidad invertida, soy “el tipo” del que dicen que si le pides, lo hace (`.../en-un-mundo-de-castidad-invertida-soy-el-tipo-del-que-dicen-que-si-le-pides-lo-hace.4731`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Producción de semillas: Aún nadie sabe que esta habilidad esta rota (`.../produccion-de-semillas-aun-nadie-sabe-que-esta-habilidad-esta-rota.5053`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Una segunda oportunidad para salvar mi reino caído (`.../una-segunda-oportunidad-para-salvar-mi-reino-caido.5033`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Ore no Wakuchin dake ga Zombie shita Sekai wo Sukueru (`.../ore-no-wakuchin-dake-ga-zombie-shita-sekai-wo-sukueru.4324`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ore no Wakuchin dake ga Zombie shita Sekai wo Sukueru (`.../ore-no-wakuchin-dake-ga-zombie-shita-sekai-wo-sukueru.4324`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 52 | Cap. 1 (`.../3143`) |  | <1s |
| pages | `getPageList(chapter)` | success | 49 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ore no Wakuchin dake ga Zombie shita Sekai wo Sukueru, URL=`.../ore-no-wakuchin-dake-ga-zombie-shita-sekai-wo-sukueru.4324` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=En un mundo de castidad invertida, soy “el tipo” del que dicen que si le pides, lo hace, URL=`.../en-un-mundo-de-castidad-invertida-soy-el-tipo-del-que-dicen-que-si-le-pides-lo-hace.4731` at page 1 offset 16 and page 2 offset 0, title=Fui Abandonado Por Mi Familia Pero Ahora Puedo Disfrutar De Una Vida Normal, URL=`.../fui-abandonado-por-mi-familia-pero-ahora-puedo-disfrutar-de-una-vida-normal.4405` at page 1 offset 17 and page 2 offset 1, title=La posada termal en la frontera se convierte en un harem, URL=`.../la-posada-termal-en-la-frontera-se-convierte-en-un-harem.4612` at page 1 offset 18 and page 2 offset 2, title=Saga de Supervivencia de la Princesa Guerrera, URL=`.../saga-de-supervivencia-de-la-princesa-guerrera.4406` at page 1 offset 19 and page 2 offset 3 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Una segunda oportunidad para salvar mi reino caído, URL=`.../una-segunda-oportunidad-para-salvar-mi-reino-caido.5033` at page 1 offset 17 and page 2 offset 0, title=Las 100 Novias Que Te Quieren Mucho Mucho Mucho Mucho Mucho, URL=`.../las-100-novias-que-te-quieren-mucho-mucho-mucho-mucho-mucho.5032` at page 1 offset 18 and page 2 offset 1, title=Suki na Hito ga Doushiyou mo Nai Hentai demo Rabukome Dekimasu ka?, URL=`.../suki-na-hito-ga-doushiyou-mo-nai-hentai-demo-rabukome-dekimasu-ka.5031` at page 1 offset 19 and page 2 offset 2 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://data.animebbg.net/.../4324.jpg <redacted query values: 1788682515>` (image/jpeg, 36638 bytes, 250x354) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ore-no-wakuchin-dake-ga-zombie-shita-sekai-wo-sukueru.4324` |  |  |  |
| details thumbnail URL | PASS | `https://data.animebbg.net/.../4324.jpg <redacted query values: 1788682515>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga, Seinen, Sugerente, Acción, Aventura, Comedia, Horror, Misterio, Harem, Apocalíptico, Zombi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★★ 5<br><br>A sus 21 años, Yuu Oikawa ha pasado gran parte de su vida encerrado en su habitación, aislado del mundo como un auténtico hikikomori. Pero ahora, ni siquiera salir de su casa es una opción: el mundo ha sido arrasado por un apocalipsis zombi y la humanidad está al borde de la extinción.<br>Su rutina solitaria cambia de golpe cuando una misteriosa sobreviviente, que se hace llamar Sunny, irrumpe en su refugio. Sin previo aviso, ella le inyecta una vacuna experimental, asegurando que podría ser la clave para salvar lo que queda del mundo. Sin embargo, el tratamiento tiene un efecto inesperado: cada vez que Yuu tiene relaciones sexuales, es capaz de devolver a los zombis a su estado humano.<br>Con esta habilidad única, Yuu se enfrenta a una realidad completamente nueva. ¿Será capaz de aprovechar este don para cambiar el destino de la humanidad? ¿O se verá atrapado en una situación aún más peligrosa de la que jamás imaginó?<br><br>**Alternative Names:**<br>- 俺のワクチンだけがゾンビ化した世界を救える |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 52 chapters |  |  |  |
| chapter dates | PASS | 52 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 49 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://russia-b.animebbg.net/.../12122-4cfc74599dfa4717cdbcc69ee11f46f5.jpg` (image/jpeg, 555827 bytes, 1200x962) |  |  |  |
