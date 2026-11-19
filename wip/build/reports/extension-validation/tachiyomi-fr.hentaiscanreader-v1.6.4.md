# Extension Validation Report

- Extension: tachiyomi-fr.hentaiscanreader-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 24
- Lint: 0
- Warnings: 3
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: scanreader
- Source ID: 8376548397716758785
- Source name: Hentai Scan Reader
- Source language: fr
- Selected manga input: popular offset 0: The Turning Point (`.../the-turning-point`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | The Turning Point (`.../the-turning-point`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 15 | Secret! Orgasm♡Hero (`.../secret-orgasm%E2%99%A1hero`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | it’s a miracle but too much (`.../its-a-miracle-but-too-much`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 10 | On Air Behind (`.../on-air-behind-2`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | The Turning Point (`.../the-turning-point`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Turning Point (`.../the-turning-point`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Turning Point, URL=`.../the-turning-point` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Akogare no Seitokaichou ga Kyonyuu Sugiru Ken, URL=`.../akogare-no-seitokaichou-ga-kyonyuu-sugiru-ken` at page 1 offset 1 and page 2 offset 6, title=Secret! Orgasm♡Hero, URL=`.../secret-orgasm%E2%99%A1hero` at page 1 offset 3 and page 2 offset 0, title=Tensei Coliseum: Saijaku Skill de Saikyou no Onna-tachi o Koryaku Shite Dorei Harem Tsukurimasu, URL=`.../tensei-coliseum-saijaku-skill-de-saikyou-no-onna-tachi-o-koryaku-shite-dorei-harem-tsukurimasu` at page 1 offset 4 and page 2 offset 3 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 45/45 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 42/45 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentai.scanreader.net/.../2b97d2d5-5336-49a0-ac45-c694a089fc51-212x300.png` (image/png, 1375245 bytes, 896x1267) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-turning-point` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://hentai.scanreader.net/.../2b97d2d5-5336-49a0-ac45-c694a089fc51.png` was not downloaded |  |  |  |
| details author | PASS | Tama |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Drama, Full Color, Long Strip, Romance, Slice of life, Video Games |  |  |  |
| details status | PASS | LICENSED (3) |  |  |  |
| details description | PASS | Do-jun devient étudiant et débute sa vie de rêve. Cependant, Do-jun vit une cohabitation forcée avec Ra-on, une amie d’enfance qui le harcèle depuis son enfance. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
