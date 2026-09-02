# Extension Validation Report

- Extension: tachiyomi-ar.arabtoons-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2424761902286195560
- Source name: عرب تونز
- Source language: ar
- Selected manga input: popular offset 0: فصل سري (`.../2258`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | فصل سري (`.../2258`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Locked Up (`.../6765`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Pleasure up! (`.../6774`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Runaway Wife (`.../7562`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | فصل سري بدون حجب (`.../3164`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | فصل سري (`.../2258`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 310 | الفصل 1 (`.../%d8%a7%d9%84%d9%81%d8%b5%d9%84-1-32`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 1: title=فصل سري, URL=`2258` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://arabtoons.net/.../SC-350x476.jpg` (image/jpeg, 33793 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `2258` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://arabtoons.net/.../SC.jpg` (image/jpeg, 622371 bytes, 1200x1680) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | أثداء كبيرة, أخ وأخت, ام وابن, جنس بالثدي, جنس بالقدم, جنس جماعي, جنس فموي, حريم, دراما, رومانسي, عاهرة, عذرية, مانجا - مانهوا, محارم, مكان عام, ملابس سباحة, ميلف |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Alternative Names: Secret Class |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 310 chapters |  |  |  |
| chapter dates | PASS | 310 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://arabtoons.net/.../01.jpg` (image/jpeg, 286423 bytes, 1080x6000) |  |  |  |
