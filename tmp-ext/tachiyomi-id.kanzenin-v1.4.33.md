# Extension Validation Report

- Extension: tachiyomi-id.kanzenin-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8834320474567176246
- Source name: Kanzenin
- Source language: id
- Selected manga input: popular offset 0: The Pleasure Shop (`.../the-pleasure-shop`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 27 | The Pleasure Shop (`.../the-pleasure-shop`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 27 | Mama Kari (`.../mama-kari`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 27 | Single Daddy (`.../single-daddy`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 27 | MILF Hunting In Another World (`.../milf-hunting-in-another-world`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Pleasure Shop (`.../the-pleasure-shop`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Pleasure Shop (`.../the-pleasure-shop`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 151 | Chapter 1 (`.../the-pleasure-shop-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 27 entries |  |  |  |
| latest listing | PASS | 27 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Pleasure Shop, URL=`.../the-pleasure-shop` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 109/109 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 109/109 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kanzenin.info/.../The-Shop-of-Pleasure-193x278-1.jpg` (image/jpeg, 11152 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-pleasure-shop` |  |  |  |
| details thumbnail URL | PASS | `https://kanzenin.info/.../The-Shop-of-Pleasure-193x278-1.jpg` |  |  |  |
| details author | PASS | kimteok |  |  |  |
| details artist | PASS | ddat |  |  |  |
| details genres | PASS | Comedy, Femdom, Mature, Milf, Romance, Story arc, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Sudah lama bekerja tapi tetap saja miskin…<br><br>Alternative Names: The Shop of Pleasure / Glory Hole Shop / 洞洞雜貨店 / 구멍가게, 구멍 열었습니다 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 151 chapters |  |  |  |
| chapter dates | PASS | 151 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdnime.xyz/.../000-19.jpg` (image/jpeg, 279711 bytes, 1810x1018) |  |  |  |
