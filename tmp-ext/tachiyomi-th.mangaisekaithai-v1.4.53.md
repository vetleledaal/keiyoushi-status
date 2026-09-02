# Extension Validation Report

- Extension: tachiyomi-th.mangaisekaithai-v1.4.53
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 28
- Lint: 1
- Warnings: 2
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 216201039129437954
- Source name: MangaIsekaiThai
- Source language: th
- Selected manga input: popular offset 0: Hazure Waku no [Joutai Ijou Skill] de Saikyou ni Natta Ore ga Subete wo Juurin Suru made (`.../hazure-waku-no-joutai-ijou-skill-de-saikyou-ni-natta-ore-ga-subete-wo-juurin-suru-made`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Hazure Waku no [Joutai Ijou Skill] de Saikyou ni Natta Ore ga Subete wo Juurin Suru made (`.../hazure-waku-no-joutai-ijou-skill-de-saikyou-ni-natta-ore-ga-subete-wo-juurin-suru-made`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 10 | Tensei Akuma no Saikyou Yuusha Ikusei Keikaku (`.../tensei-akuma-no-saikyou-yuusha-ikusei-keikaku`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Hazure Waku no [Joutai Ijou Skill] de Saikyou ni Natta Ore ga Subete wo Juurin Suru made (`.../hazure-waku-no-joutai-ijou-skill-de-saikyou-ni-natta-ore-ga-subete-wo-juurin-suru-made`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Hazure Waku no [Joutai Ijou Skill] de Saikyou ni Natta Ore ga Subete wo Juurin Suru made (`.../hazure-waku-no-joutai-ijou-skill-de-saikyou-ni-natta-ore-ga-subete-wo-juurin-suru-made`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 150 | ตอนที่ 1 (`https://www.mangaisekaithai.net/.../%e0%b8%95%e0%b8%ad%e0%b8%99%e0%b8%97%e0%b8%b5%e0%b9%88-1 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 48 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Hazure Waku no \[Joutai Ijou Skill\] de Saikyou ni Natta Ore ga Subete wo Juurin Suru made, URL=`.../hazure-waku-no-joutai-ijou-skill-de-saikyou-ni-natta-ore-ga-subete-wo-juurin-suru-made` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 21/21 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 21/21 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.mangaisekaithai.net/.../Hazure-Waku-no-Joutai-Ijou-Skill-de-Saikyou-ni-Natta-Ore-ga-Subete-wo-Juurin-Suru-made-175x238.jpg` (image/jpeg, 17987 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hazure-waku-no-joutai-ijou-skill-de-saikyou-ni-natta-ore-ga-subete-wo-juurin-suru-made` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.mangaisekaithai.net/.../Hazure-Waku-no-Joutai-Ijou-Skill-de-Saikyou-ni-Natta-Ore-ga-Subete-wo-Juurin-Suru-made-193x278.jpg` (image/jpeg, 22563 bytes, 193x278) |  |  |  |
| details author | PASS | Shinozaki Kaoru |  |  |  |
| details artist | PASS | Uyoshi Shou |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Ecchi, Fantasy, Harem, Manga, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 150 chapters |  |  |  |
| chapter dates | PASS | 150 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 150 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.mangaisekaithai.com/.../Upload-Hazure-Waku-no-Joutai-Ijou-Skill-de-Saikyou-ni-Natta-Ore-ga-Subete-wo-Juurin-Suru-made-1-XF4MO.jpg` (image/jpeg, 196348 bytes, 1000x1422) |  |  |  |
