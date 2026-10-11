# Extension Validation Report

- Extension: tachiyomi-id.hentaicrot-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Selected manga input: popular offset 0: Ijimekko, Onna ni Naru (`.../ijimekko-onna-ni-naru`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | Ijimekko, Onna ni Naru (`.../ijimekko-onna-ni-naru`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 8 | Tsumetai Kimi to Atsui Game o (`.../tsumetai-kimi-to-atsui-game-o`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Ijimekko, Onna ni Naru (`.../ijimekko-onna-ni-naru`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ijimekko, Onna ni Naru (`.../ijimekko-onna-ni-naru`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../ijimekko-onna-ni-naru`) |  | <1s |
| pages | `getPageList(chapter)` | success | 40 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ijimekko, Onna ni Naru, URL=`.../ijimekko-onna-ni-naru` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 17/17 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 17/17 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaicrot.com/.../Ijimekko-Onna-ni-Naru-01-200x285.jpg` (image/jpeg, 16665 bytes, 200x285) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ijimekko-onna-ni-naru` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaicrot.com/.../Ijimekko-Onna-ni-Naru-01.jpg` (image/jpeg, 296959 bytes, 1450x2048) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Blowjob, Booty, Creampie, Doggy Style, Pubic Hair, Toket Besar, Uncensored |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Baca komik hentai manga xxx bokep sex porn Ijimekko, Onna ni Naru. Alternative Name(s) : いじめっ子、女になる Jumlah halaman : 41 Bahasa : Indonesia Artists : Great Mosu Groups : MOSQUITONE |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.openhentai.net/.../My-Bully-Turned-Into-a-Girl-%20(2).webp` (image/webp (container: extended), 355470 bytes, 1450x2048) |  |  |  |
