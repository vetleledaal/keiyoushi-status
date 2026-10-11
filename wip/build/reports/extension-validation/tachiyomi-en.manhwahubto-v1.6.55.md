# Extension Validation Report

- Extension: tachiyomi-en.manhwahubto-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 3868891550336834170
- Source name: ManhwaHub.to
- Source language: en
- Selected manga input: popular offset 0: I Banged All My Classmates After Graduation (`.../94`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | I Banged All My Classmates After Graduation (`.../94`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Stepmother Friends (`.../511`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | S-Mate (`.../1572`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | No Man’s Land (`.../539`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I Banged All My Classmates After Graduation (`.../94`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Banged All My Classmates After Graduation (`.../94`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 18 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Banged All My Classmates After Graduation, URL=`94` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhwahub.to/.../i-banged-all-my-classmates-after-graduation-350x476.webp` (image/webp (encoding: lossless), 172942 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `94` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://manhwahub.to/.../i-banged-all-my-classmates-after-graduation-193x278.webp` (image/webp (encoding: lossless), 66246 bytes, 193x278) |  |  |  |
| details author | PASS | Byeongarineun Ppiyak, Meonsong |  |  |  |
| details artist | PASS | Meonsong |  |  |  |
| details genres | PASS | Adult, Drama, Fantasy, Harem, School Life, Seinen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | "Does it feel good… having me suck you with my mouth that's worth more than your entire body?"<br><br>I was the only commoner at an elite aristocratic high school for the top 0.1%. I lived a trampled life for three years, but everything flipped during the graduation trip. They had everything since the day they were born… will they be able to bow their heads before me, who was once a slave to them?<br><br>Alternative Names: After Graduating I Slept With All My Classmates, After Graduation, I Fucked All My Classmates, I Ate All My Classmates After Graduation, Slept With All Her Classmates After Graduation, 졸업 후 반 친구들을 다 따먹음 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 18 chapters |  |  |  |
| chapter dates | LINT | All 18 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=18 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.manhwahub.to/.../0.webp` (image/webp (encoding: lossy), 671096 bytes, 720x13745) |  |  |  |
