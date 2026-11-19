# Extension Validation Report

- Extension: tachiyomi-en.mangahome-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 27
- Lint: 0
- Warnings: 0
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 933332296024902732
- Source name: MangaHome
- Source language: en
- Selected manga input: popular offset 0: Namaikizakari. (`.../namaikizakari`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Namaikizakari. (`.../namaikizakari`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | Horimiya (`.../horimiya`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | Kingdom (`.../kingdom`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Monster’s Live Streaming (`.../monster_s_live_streaming`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Namaikizakari. (`.../namaikizakari`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Namaikizakari. (`.../namaikizakari`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | <1s |
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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Namaikizakari., URL=`namaikizakari` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://fmcdn.mangahere.com/.../ocover.jpg <redacted query values: token, ttl, and v>` (image/jpeg, 19998 bytes, 200x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `namaikizakari` |  |  |  |
| details thumbnail URL | PASS | `http://fmcdn.mangahere.com/.../ocover.jpg <redacted query values: token, ttl, and v>` |  |  |  |
| details author | PASS | MIYUKI Mitsubachi |  |  |  |
| details artist | PASS | MIYUKI Mitsubachi |  |  |  |
| details genres | PASS | Comedy, Romance, Shoujo, Sports |  |  |  |
| details status | PASS | LICENSED (3) |  |  |  |
| details description | PASS | ★★★★★ 4.85 (559)<br>Rank #1<br><br>Upon first sight Machida Yuki knows that she doesn’t want anything to do with Naruse Shou, but how can she keep her cool when he is a part of the basketball club she manages?<br><br>**Alternative Names:**<br>- なまいきざかり。<br>- 盛气凌人<br>- His Cheekiness is in Full Bloom.<br>- Namaiki Zakari.<br>- Namaikizakari |  |  |  |
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
