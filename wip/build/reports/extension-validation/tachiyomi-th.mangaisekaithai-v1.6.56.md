# Extension Validation Report

- Extension: tachiyomi-th.mangaisekaithai-v1.6.56
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 0
- Warnings: 2
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 216201039129437954
- Source name: MangaIsekaiThai
- Source language: th
- Selected manga input: popular offset 0: Hazure Waku no [Joutai Ijou Skill] de Saikyou ni Natta Ore ga Subete wo Juurin Suru made (`.../35`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Hazure Waku no [Joutai Ijou Skill] de Saikyou ni Natta Ore ga Subete wo Juurin Suru made (`.../35`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 10 | Tensei Akuma no Saikyou Yuusha Ikusei Keikaku (`.../2183`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Hazure Waku no [Joutai Ijou Skill] de Saikyou ni Natta Ore ga Subete wo Juurin Suru made (`.../35`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Hazure Waku no [Joutai Ijou Skill] de Saikyou ni Natta Ore ga Subete wo Juurin Suru made (`.../35`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 150 | ตอนที่ 1 (`.../%e0%b8%95%e0%b8%ad%e0%b8%99%e0%b8%97%e0%b8%b5%e0%b9%88-1`) |  | <1s |
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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Hazure Waku no \[Joutai Ijou Skill\] de Saikyou ni Natta Ore ga Subete wo Juurin Suru made, URL=`35` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 21/21 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 21/21 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.mangaisekaithai.net/.../Hazure-Waku-no-Joutai-Ijou-Skill-de-Saikyou-ni-Natta-Ore-ga-Subete-wo-Juurin-Suru-made-175x238.jpg` (image/jpeg, 17987 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `35` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.mangaisekaithai.net/.../Hazure-Waku-no-Joutai-Ijou-Skill-de-Saikyou-ni-Natta-Ore-ga-Subete-wo-Juurin-Suru-made-193x278.jpg` (image/jpeg, 22563 bytes, 193x278) |  |  |  |
| details author | PASS | Shinozaki Kaoru |  |  |  |
| details artist | PASS | Uyoshi Shou |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Ecchi, Fantasy, Harem, Manga, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 150 chapters |  |  |  |
| chapter dates | PASS | 150 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://img.mangaisekaithai.com/.../Upload-Hazure-Waku-no-Joutai-Ijou-Skill-de-Saikyou-ni-Natta-Ore-ga-Subete-wo-Juurin-Suru-made-1-XF4MO.jpg` to `https://img.mangaisekaithai.net/.../Upload-Hazure-Waku-no-Joutai-Ijou-Skill-de-Saikyou-ni-Natta-Ore-ga-Subete-wo-Juurin-Suru-made-1-XF4MO.jpg` (1 redirects) |  |  |  |
| page load | PASS | `https://img.mangaisekaithai.com/.../Upload-Hazure-Waku-no-Joutai-Ijou-Skill-de-Saikyou-ni-Natta-Ore-ga-Subete-wo-Juurin-Suru-made-1-XF4MO.jpg` (image/jpeg, 196348 bytes, 1000x1422) |  |  |  |
