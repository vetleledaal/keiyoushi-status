# Extension Validation Report

- Extension: tachiyomi-ar.arabmanhwa-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5823096631874106406
- Source name: ArabManhwa
- Source language: ar
- Selected manga input: popular offset 0: صيد الميلف في عالم آخر (`.../585`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | صيد الميلف في عالم آخر (`.../585`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 16 | الحياة الجنسية للمحارب العائد (`.../638`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 16 | توأمي المتزوجة (`.../3798`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 16 | نيك عمتي (`.../3784`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | صيد الميلف في عالم آخر (`.../5138`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | صيد الميلف في عالم آخر (`.../585`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 132 | الفصل 01 (`.../%d8%a7%d9%84%d9%81%d8%b5%d9%84-01`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 27 |  |  | 1-10s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=صيد الميلف في عالم آخر, URL=`585` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 66/66 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 66/66 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://arabmanhwa.com/.../1-39254-175x238.jpg` (image/jpeg, 23312 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `585` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://arabmanhwa.com/.../1-39254-193x278.jpg` (image/jpeg, 26643 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | أثداد كبيرة, إذلال, ابتزاز, اغتصاب, جنس شرجي, جنس فموي, رومانسي, ميلف |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | بعد أن تم القبض عليه أثناء مواجهة حميمة مع ميلف، هرب تاي يانغ إلى عالم آخر. عند دخوله إلى العالم الآخر وجد نفس في قلعة و يوجد هناك ميلف من الدرجة الأولى بجسم مذهل، هل سيتمكن تاي يانغ من صنع حريمه بأمان في هذا العالم؟ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 132 chapters |  |  |  |
| chapter dates | LINT | 10 of 132 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=10 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.arabmanhwa.com/.../001.jpg` (image/jpeg, 713652 bytes, 721x7415; server Content-Type: binary/octet-stream) |  |  |  |
