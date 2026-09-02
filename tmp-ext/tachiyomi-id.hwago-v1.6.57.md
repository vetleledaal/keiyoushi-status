# Extension Validation Report

- Extension: tachiyomi-id.hwago-v1.6.57
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5490253431755133280
- Source name: Hwago
- Source language: id
- Selected manga input: popular offset 0: Beasts That Cross the Line (`.../beasts-that-cross-the-line`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Beasts That Cross the Line (`.../beasts-that-cross-the-line`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | You Won’t Break Me (`.../you-wont-break-me`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | I Became the Most Terrifying Stepmother in History?! (`.../i-became-the-most-terrifying-stepmother-in-history`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Sprout (`.../sprout`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Beasts That Cross the Line (`.../beasts-that-cross-the-line`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Beasts That Cross the Line (`.../beasts-that-cross-the-line`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 42 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 7 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Beasts That Cross the Line, URL=`beasts-that-cross-the-line` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Wind Breaker, URL=`honeypot-trap-xz9k2` at page 1 offset 24 and page 2 offset 24 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Return of the Blossoming Blade, URL=`honeypot-trap-xz9k2` at page 1 offset 24 and page 2 offset 24 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hwg.imgsvr.my.id/.../cover_iiNiek.webp` (image/jpeg, 21545 bytes, 299x400; server Content-Type: image/webp) |  |  |  |
| details identity | PASS | Details preserved selected URL `beasts-that-cross-the-line` |  |  |  |
| details thumbnail URL | PASS | `https://hwg.imgsvr.my.id/.../cover_iiNiek.webp` |  |  |  |
| details author | PASS | Kkoleuleuk |  |  |  |
| details artist | PASS | Jeonghwa |  |  |  |
| details genres | PASS | Adult, Drama, Ecchi, Mature, Reverse Harem, Smut, Josei |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Seo Jisoo, yang sedang hancur karena gagal promosi dan dikhianati kekasihnya, tak menyangka bahwa pelariannya kepada Kwon Sehyeok—sahabat yang ia percayai selama 20 tahun—justru menjadi awal dari jeratan obsesi yang tak terelakkan. Sehyeok yang selama ini menyembunyikan sisi “binatang buasnya” secara tak terduga mengambil kendali penuh atas hidup Jisoo, mengklaimnya sebagai kekasih melalui rencana provokatif yang menghancurkan batas persahabatan mereka selamanya. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 42 chapters |  |  |  |
| chapter dates | PASS | 42 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://hwg.imgsvr.my.id/.../001_EgWFJa.webp` (image/webp (container: extended), 413726 bytes, 728x7280) |  |  |  |
