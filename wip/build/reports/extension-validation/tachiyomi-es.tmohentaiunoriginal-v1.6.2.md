# Extension Validation Report

- Extension: tachiyomi-es.tmohentaiunoriginal-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6465093267346907024
- Source name: TMOHentai (unoriginal)
- Source language: es
- Selected manga input: popular offset 0: Giri no Oyako ga Doukyou Shitereba Kitto kou 2 (`.../giri-no-oyako-ga-doukyou-shitereba-kitto-kou-2`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Giri no Oyako ga Doukyou Shitereba Kitto kou 2 (`.../giri-no-oyako-ga-doukyou-shitereba-kitto-kou-2`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Niji Ero Trap Dungeon-bu 5 _ Club de Mazmorras Eróticas Niji 5 (`.../niji-ero-trap-dungeon-bu-5-club-de-mazmorras-eroticas-niji-5`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Giri no Oyako ga Doukyou Shitereba Kitto kou 2 (`.../giri-no-oyako-ga-doukyou-shitereba-kitto-kou-2`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Niji Ero Trap Dungeon-bu 5 _ Club de Mazmorras Eróticas Niji 5 (`.../niji-ero-trap-dungeon-bu-5-club-de-mazmorras-eroticas-niji-5`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Giri no Oyako ga Doukyou Shitereba Kitto kou 2 (`.../giri-no-oyako-ga-doukyou-shitereba-kitto-kou-2`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Giri no Oyako ga Doukyou Shitereba Kitto kou 2 (`.../giri-no-oyako-ga-doukyou-shitereba-kitto-kou-2`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo único (`.../21971`) |  | <1s |
| pages | `getPageList(chapter)` | success | 41 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Giri no Oyako ga Doukyou Shitereba Kitto kou 2, URL=`.../giri-no-oyako-ga-doukyou-shitereba-kitto-kou-2` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 98/98 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 98/98 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.tmohentai.app/.../1.webp` (image/webp (encoding: lossy), 136918 bytes, 976x1092) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../giri-no-oyako-ga-doukyou-shitereba-kitto-kou-2` |  |  |  |
| details thumbnail URL | PASS | `https://storage.tmohentai.app/.../1.webp` |  |  |  |
| details author | PASS | Shimipan |  |  |  |
| details artist | PASS | Shimipan |  |  |  |
| details genres | PASS | Milf, Incest, Big Ass, Big Boobs, Creampie, big areolae, full color, big penis, blowjob face, Tetonas |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | No hay descripción disponible para esta obra. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://storage.tmohentai.app/.../1.webp` (image/webp (encoding: lossy), 136918 bytes, 976x1092) |  |  |  |
