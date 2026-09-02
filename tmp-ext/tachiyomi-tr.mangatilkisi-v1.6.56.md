# Extension Validation Report

- Extension: tachiyomi-tr.mangatilkisi-v1.6.56
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 27
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1820900722595855271
- Source name: MangaTilkisi
- Source language: tr
- Selected manga input: popular offset 0: Murim Dünyasına Giriş (`.../140`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Murim Dünyasına Giriş (`.../140`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Servet Kazanmak İçin Para Kaybediyorum (`.../175`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Bana Emziğimi Ver (`.../312`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Tanrıların Gizemli Kanalına Abone Oldum (`.../155`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Murim Dünyasına Giriş (`.../140`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | error | 0 |  | java.lang.NullPointerException | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 252 |  (`.../bolum-01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Murim Dünyasına Giriş, URL=`140` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.tilkiscans.com/.../Murim-Dunyasina-Giris-1-350x476.webp` (image/webp (encoding: lossy), 46128 bytes, 350x476) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 252 chapters |  |  |  |
| chapter dates | PASS | 252 positive upload dates |  |  |  |
| chapter titles | LINT | One or more chapters have no title |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.tilkiscans.com/.../02.webp` (image/webp (encoding: lossy), 347090 bytes, 720x7686) |  |  |  |
