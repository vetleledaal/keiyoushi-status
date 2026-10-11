# Extension Validation Report

- Extension: tachiyomi-ja.manga1000-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 3
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2990178902658283254
- Source name: Manga1000
- Source language: ja
- Selected manga input: popular offset 0: KONO INU TOKITARA MAGO NO KOTO SHIKA KANGAETE INAI ~ INSEI MAOU NO YARI NOKOSHI ~ RAW (`.../manga-kono-inu-tokitara-mago-no-koto-shika-kangaete-inai-insei-maou-no-yari-nokoshi-raw`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | KONO INU TOKITARA MAGO NO KOTO SHIKA KANGAETE INAI ~ INSEI MAOU NO YARI NOKOSHI ~ RAW (`.../manga-kono-inu-tokitara-mago-no-koto-shika-kangaete-inai-insei-maou-no-yari-nokoshi-raw`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | MUSHOKU TENSEI - ISEKAI ITTARA HONKI DASU - RAW (`.../manga-mushoku-tensei-isekai-ittara-honki-dasu-raw`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | KONO INU TOKITARA MAGO NO KOTO SHIKA KANGAETE INAI ~ INSEI MAOU NO YARI NOKOSHI ~ RAW (`.../manga-kono-inu-tokitara-mago-no-koto-shika-kangaete-inai-insei-maou-no-yari-nokoshi-raw`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | KONO INU TOKITARA MAGO NO KOTO SHIKA KANGAETE INAI ~ INSEI MAOU NO YARI NOKOSHI ~ RAW (`.../manga-kono-inu-tokitara-mago-no-koto-shika-kangaete-inai-insei-maou-no-yari-nokoshi-raw`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 24 | Chapter 1 (`.../1242935`) |  | <1s |
| pages | `getPageList(chapter)` | success | 48 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=KONO INU TOKITARA MAGO NO KOTO SHIKA KANGAETE INAI ~ INSEI MAOU NO YARI NOKOSHI ~ RAW, URL=`.../manga-kono-inu-tokitara-mago-no-koto-shika-kangaete-inai-insei-maou-no-yari-nokoshi-raw` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i4.hachiraw.win/.../04_6833f3b722608.jpg` (image/jpeg, 259911 bytes, 320x454) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../manga-kono-inu-tokitara-mago-no-koto-shika-kangaete-inai-insei-maou-no-yari-nokoshi-raw` |  |  |  |
| details thumbnail URL | PASS | `https://i4.hachiraw.win/.../04_6833f3b722608.jpg` |  |  |  |
| details author | PASS | Keisuke Ide |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasy, Comedy, Slice of Life, Action, Adventure |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | The rule of the Demon King’s army, known as the “Demonic Era,” lasted for centuries. Countless heroes fell before the Demon King, powerless to stop him… Until the last hope, Hero Terios, finally struck him down. With peace restored to the world, Terios vanished without a trace. However, the Demon King—thought to be dead—miraculously comes back to life… as a dog!? Thus begins the tale of the last Demon King, now a fluffy canine, who just wants to live a peaceful life while protecting his granddaughter— who’s now being targeted by everyone in the world!<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 24 chapters |  |  |  |
| chapter dates | LINT | All 24 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=24 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://p16-sg.tiktokcdn.com/.../ba017411372e6a74d45461d17402a8ee` (image/png, 1690574 bytes, 844x1200) |  |  |  |
