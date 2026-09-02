# Extension Validation Report

- Extension: tachiyomi-id.inazumanga-v1.6.43
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1645729642561182833
- Source name: ReYume
- Source language: id
- Selected manga input: popular offset 0: Shangri-La Frontier ~Kusoge Hunter. Kamige ni Idoman to su~ (`.../shangri-la-frontier-kusoge-hunter.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Shangri-La Frontier ~Kusoge Hunter. Kamige ni Idoman to su~ (`.../shangri-la-frontier-kusoge-hunter.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Yuusha Party wo Tsuihou Sareta Ore da ga, Ore kara Sudatte Kureta you de Ureshii... Nanode Daiseijo, Omae ni Otte Korarete wa Komaru no da ga? (`.../yuusha-party-wo-tsuihou-sareta-ore-da.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Tsuihousareru Tabi ni Skill wo Te ni Ireta Ore ga, 100 no Isekai de 2-shuume Musou (`.../tsuihousareru-tabi-ni-skill-wo-te-ni.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Shangri-La Frontier ~Kusoge Hunter. Kamige ni Idoman to su~ (`.../shangri-la-frontier-kusoge-hunter.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Shangri-La Frontier ~Kusoge Hunter. Kamige ni Idoman to su~ (`.../shangri-la-frontier-kusoge-hunter.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 262 | Shangri-La Frontier Chapter 17 (`.../shangri-la-frontier-chapter-17.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Shangri-La Frontier ~Kusoge Hunter. Kamige ni Idoman to su~, URL=`.../shangri-la-frontier-kusoge-hunter.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 53/53 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 53/53 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../fcf0b45c-ac32-44c6-b7d7-f0aeb7de8fe4.webp` (image/jpeg, 57809 bytes, 300x429) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../shangri-la-frontier-kusoge-hunter.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../fcf0b45c-ac32-44c6-b7d7-f0aeb7de8fe4.webp` (image/jpeg, 145896 bytes, 540x771) |  |  |  |
| details author | PASS | katarina |  |  |  |
| details artist | PASS | Fuji Ryousuke |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Fantasy, Game, Magic, Sci-Fi, Shounen, Slice of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Hizutome Rakurou menyukai game yang menyebalkan. Tantangan berikutnya adalah Shangri-la Frontier, game tingkat dewa dengan total playerbase 30.000.000. Mengumpulkan rekan-rekan (sampah) di dunia yang luas dan bertemu dengan musuh lama di sepanjang jalan, dia akan mengubah nasib setiap pemain.<br><br>Nama lain: Shangri-La Frontier: From Trash Game Hunter to God-Tier Gamer! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 262 chapters |  |  |  |
| chapter dates | PASS | 262 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../0.westmanga.info.jpg` (image/webp (container: extended), 95474 bytes, 840x1050) |  |  |  |
