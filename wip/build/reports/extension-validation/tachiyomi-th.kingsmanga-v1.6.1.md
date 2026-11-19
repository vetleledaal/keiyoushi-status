# Extension Validation Report

- Extension: tachiyomi-th.kingsmanga-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 2
- Warnings: 3
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1587589192279166197
- Source name: KingsManga
- Source language: th
- Selected manga input: popular offset 0: The Village's Special Law (`.../the-villages-special-law`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 82 | The Village's Special Law (`.../the-villages-special-law`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | Kono Ai wo Owarasete... (`.../kono-ai-wo-owarasete-kurenai-ka`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 46 | Genius Grandson of t... (`.../genius-grandson-of-the-loan-shark-king`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Village's Special Law (`.../the-villages-special-law`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Village’s Special Law (`.../the-villages-special-law`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 60 | The Village's Special Law 4 (`.../the-villages-special-law-4`) |  | <1s |
| pages | `getPageList(chapter)` | success | 40 |  |  | <1s |

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
| popular listing | PASS | 82 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Village's Special Law, URL=`.../the-villages-special-law` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Kono Ai wo Owarasete..., URL=`.../kono-ai-wo-owarasete-kurenai-ka` at page 1 offset 0 and page 2 offset 26, title=Reincarnator's Strea..., URL=`.../reincarnators-stream` at page 1 offset 3 and page 2 offset 29, title=Yani Neko, URL=`.../yani-neko` at page 1 offset 4 and page 2 offset 21, title=I Only See You, URL=`.../i-only-see-you` at page 1 offset 5 and page 2 offset 18, title=I'm a Villainess, bu..., URL=`.../im-a-villainess-but-i-wont-live-like-one` at page 1 offset 6 and page 2 offset 28, title=I Became the Manager..., URL=`.../i-became-the-manager-of-a-sponsored-idol` at page 1 offset 13 and page 2 offset 43, title=My Ideal Type is My ..., URL=`.../my-ideal-type-is-my-friends-mom` at page 1 offset 17 and page 2 offset 45, title=Gokufuri Kyohi Shite..., URL=`.../gokufuri-kyohi-shite-tesaguri-start-tokka-shinai-healer-nakama-to-wakarete-tabi-ni-deru` at page 1 offset 22 and page 2 offset 22, title=The Youngest Daughte..., URL=`.../the-youngest-daughter-of-the-legendary-41` at page 1 offset 26 and page 2 offset 20, title=Magic Emperor, URL=`.../magic-emperor` at page 1 offset 27 and page 2 offset 35, title=Ojousama-kei Teihen ..., URL=`.../ojousama-kei-teihen-dungeon-haishinsha-haishin-kiriwasure-ni-kizukazu-dougyousha-wo-bokotte-shimau` at page 1 offset 35 and page 2 offset 38 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 169/169 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 86/169 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | UNUSUAL | Details changed selected title The Village's Special Law to The Village’s Special Law |  |  |  |
| details thumbnail URL | PASS | `https://image9.kingsmanga.net/.../Upload--The-Villages-Special-Law-66-1.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 60 chapters |  |  |  |
| chapter dates | LINT | All 60 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=60 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://image9.kingsmanga.net/.../Upload--The-Villages-Special-Law-4-1.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 502 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
