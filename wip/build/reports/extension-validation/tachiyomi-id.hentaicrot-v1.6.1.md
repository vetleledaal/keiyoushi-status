# Extension Validation Report

- Extension: tachiyomi-id.hentaicrot-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: oceanwp
- Source ID: 1764268677652741702
- Source name: Hentai Crot
- Source language: id
- Selected manga input: popular offset 0: A-Block: Death Wish (`.../a-block-death-wish`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | A-Block: Death Wish (`.../a-block-death-wish`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 8 | Yo ni mo Kimochi ii Majikku Shou (`.../yo-ni-mo-kimochi-ii-majikku-shou`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A-Block: Death Wish (`.../a-block-death-wish`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A-Block: Death Wish (`.../a-block-death-wish`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../a-block-death-wish`) |  | <1s |
| pages | `getPageList(chapter)` | success | 52 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A-Block: Death Wish, URL=`.../a-block-death-wish` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 17/17 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 17/17 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaicrot.com/.../A-Block-Death-Wish-cover-200x285.jpg` (image/jpeg, 14625 bytes, 200x285) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-block-death-wish` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaicrot.com/.../A-Block-Death-Wish-cover.jpg` (image/jpeg, 138860 bytes, 1280x1813) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Blowjob, Booty, Creampie, Cunnilingus, Doggy Style, Group, Netorare, Toket Besar, Tomboy, Uncensored |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Baca komik hentai manga xxx bokep sex porn A-Block: Death Wish. Alternative Name(s) : – Jumlah halaman : 52 Bahasa : Indonesia Artists : Juuichi Gatsu Group : WaifuSplit |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.openhentai.net/.../A-Block-Death-Wish-Permintaan-Terakhirku-adalah-Ngesex-%20(1).jpg` (image/jpeg, 284281 bytes, 745x1056) |  |  |  |
