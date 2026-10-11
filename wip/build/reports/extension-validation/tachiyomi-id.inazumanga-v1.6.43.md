# Extension Validation Report

- Extension: tachiyomi-id.inazumanga-v1.6.43
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 1
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 1645729642561182833
- Source name: ReYume
- Source language: id
- Selected manga input: popular offset 0: Shangri-La Frontier ~Kusoge Hunter. Kamige ni Idoman to su~ (`.../shangri-la-frontier-kusoge-hunter.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 13 | Shangri-La Frontier ~Kusoge Hunter. Kamige ni Idoman to su~ (`.../shangri-la-frontier-kusoge-hunter.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Munou no Akudou Ouji wa Ikinokoritai ~Ren'ai RPG no Akuyaku Mob ni Tensei Shita kedo, Gensaku Mushi shite Saikyou o Mezasu~ (`.../munou-no-akudou-ouji-wa-ikinokoritai.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Yuusha Party wo Tsuihou Sareta Ore da ga, Ore kara Sudatte Kureta you de Ureshii... Nanode Daiseijo, Omae ni Otte Korarete wa Komaru no da ga? (`.../yuusha-party-wo-tsuihou-sareta-ore-da.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Shangri-La Frontier ~Kusoge Hunter. Kamige ni Idoman to su~ (`.../shangri-la-frontier-kusoge-hunter.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Shangri-La Frontier ~Kusoge Hunter. Kamige ni Idoman to su~ (`.../shangri-la-frontier-kusoge-hunter.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 267 | Shangri-La Frontier Chapter 01  (`.../shangri-la-frontier-chapter-01.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 63 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 13 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Shangri-La Frontier ~Kusoge Hunter. Kamige ni Idoman to su~, URL=`.../shangri-la-frontier-kusoge-hunter.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 54/54 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 54/54 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../slf%20vol%2028.webp` (image/jpeg, 62248 bytes, 300x429) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../shangri-la-frontier-kusoge-hunter.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../slf%20vol%2028.webp` (image/jpeg, 158370 bytes, 540x771) |  |  |  |
| details author | PASS | katarina |  |  |  |
| details artist | PASS | Fuji Ryousuke |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Fantasy, Game, Magic, Sci-Fi, Shounen, Slice of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Hizutome Rakurou menyukai game yang menyebalkan. Tantangan berikutnya adalah Shangri-la Frontier, game tingkat dewa dengan total playerbase 30.000.000. Mengumpulkan rekan-rekan (sampah) di dunia yang luas dan bertemu dengan musuh lama di sepanjang jalan, dia akan mengubah nasib setiap pemain.<br><br>Nama lain: Shangri-La Frontier: From Trash Game Hunter to God-Tier Gamer! |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 267 name |  |  |  |
| chapters | PASS | 267 chapters |  |  |  |
| chapter dates | PASS | 267 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 63 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../0.westmanga.info.jpg` (image/webp (container: extended), 158648 bytes, 760x1200) |  |  |  |
