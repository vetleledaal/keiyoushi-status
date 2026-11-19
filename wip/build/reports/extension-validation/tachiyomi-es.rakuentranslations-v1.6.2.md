# Extension Validation Report

- Extension: tachiyomi-es.rakuentranslations-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 1527666187989988991
- Source name: Rakuen Translations
- Source language: es
- Selected manga input: popular offset 0: Class no Daikirai na Joshi to Kekkon Suru Koto ni Natta (`.../class-no-daikirai-na-joshi-to-kekkon-suru-koto-ni-natta`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Class no Daikirai na Joshi to Kekkon Suru Koto ni Natta (`.../class-no-daikirai-na-joshi-to-kekkon-suru-koto-ni-natta`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 15 | Hazure Waku no Joutai Ijou Skill de Saikyou ni Natta Ore ga Subete o Juurin Suru made (`.../hazure-waku-no-joutai-ijou-skill-de-saikyou-ni-natta-ore-ga-subete-wo-juurin-suru-made`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Shibou Endo o Kaihi shita Gyaruge no Hirointachi ga Ore no Nikkichou (`.../shibou-endo-o-kaihi-shita-gyaruge-no-hirointachi-ga-ore-no-nikkichou`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 15 | Isekai Meikyuu de Harem o (`.../isekai-meikyuu-de-harem-o`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Class no Daikirai na Joshi to Kekkon Suru Koto ni Natta (`.../class-no-daikirai-na-joshi-to-kekkon-suru-koto-ni-natta`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Class no Daikirai na Joshi to Kekkon Suru Koto ni Natta (`.../class-no-daikirai-na-joshi-to-kekkon-suru-koto-ni-natta`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 69 | Capítulo 1 (`.../class-no-daikirai-na-joshi-to-kekkon-suru-koto-ni-natta-capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 38 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Class no Daikirai na Joshi to Kekkon Suru Koto ni Natta, URL=`.../class-no-daikirai-na-joshi-to-kekkon-suru-koto-ni-natta` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 71/71 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 71/71 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../class.jpg <redacted query values: resize>` (image/jpeg, 29909 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../class-no-daikirai-na-joshi-to-kekkon-suru-koto-ni-natta` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i0.wp.com/.../class.jpg` (image/jpeg, 161935 bytes, 848x1216) |  |  |  |
| details author | PASS | AMANO Seiju |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedia, Drama, Ecchi, Romance, Vida diaria |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | El estudiante de preparatoria Hojo Saito se ha casado con su compañera de clase. Y es con la chica que es su peor enemigo en la escuela, Sakuramori Akane. Parece que no pueden ser sinceros el uno con el otro, ¡Pero su desgarradora vida de recién casados está a punto de comenzar!<br><br>Nombres alternativos: <br>- Class no Daikirai na Joshi to Kekkon Suru koto ni natta<br>- I Got Married to the Girl I Hate Most in Class<br>- I'm Getting Married to a Girl I Hate in My Class<br>- Kurakon<br>- เมื่อคู่กัดตัวร้ายกลายเป็นภรรยาหวานใจ<br>- クラスの大嫌いな女子と結婚することになった。<br>- クラ婚<br>- 我和班上最讨厌的女生结婚了。<br>- 我要和班裡我最討厭的妹子結婚了<br>- 같은 반의 제일 싫어하는 여자와 결혼하게 되었다 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 69 chapters |  |  |  |
| chapter dates | PASS | 69 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i3.wp.com/.../00.png` (image/webp (encoding: lossy), 166706 bytes, 1321x838) |  |  |  |
