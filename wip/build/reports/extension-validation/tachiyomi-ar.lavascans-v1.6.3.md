# Extension Validation Report

- Extension: tachiyomi-ar.lavascans-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 3209001028102012989
- Source name: Lava Scans
- Source language: ar
- Selected manga input: popular offset 0: Logging 10.000 Years into the Future (`.../logging-10-000-years-into-the-future`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | Logging 10.000 Years into the Future (`.../logging-10-000-years-into-the-future`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 32 | after merging with the goddess i am invincible (`.../after-merging-with-the-goddess-i-am-invincible`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 32 | Chronicles of the Blood Demon (`.../chronicles-of-the-blood-demon`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 32 | Tale of a Scribe Who Retires to the Countryside (`.../tale-of-a-scribe-who-retires-to-the-countryside`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Logging 10.000 Years into the Future (`.../logging-10-000-years-into-the-future`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Logging 10.000 Years into the Future (`.../2072267132-logging-10-000-years-into-the-future`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 375 | فصل 1 (`.../2494451884-logging-10-000-years-into-the-future-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | <1s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 32 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Logging 10.000 Years into the Future, URL=`.../logging-10-000-years-into-the-future` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 129/129 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 129/129 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lavascans.com/.../2025-12-21-05-52-11-1766339531412.webp` (image/webp (container: extended), 439482 bytes, 980x1431) |  |  |  |
| details identity | UNUSUAL | Details changed selected URL `.../logging-10-000-years-into-the-future` to `.../2072267132-logging-10-000-years-into-the-future` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://lavascans.com/.../2025-12-21-05-52-11-1766339531412-701x1024.webp` (image/webp (container: extended), 181924 bytes, 701x1024) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | أكشن, خارق للطبيعة, شونين, فنون قتال, مغامرة |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | في فجر ثورة في عصر فنون الدفاع عن النفس ، تبدأ جحافل من الوحوش المرعبة بغزو العالم ، وهزيمة محاربي البشرية واحدًا تلو الآخر. في أحد الأيام ، وجد لو شنغ نفسه يحلم بالعالم بعد عشرة آلاف عام من المستقبل ، حيث تم تعديل حتى تقنيات التدريب البدني الأساسية وأصبحت أكثر فعالية بعدة آلاف من المرات! تقنيات التنفس ، وعلاجات تقوية الجسم ، وكتب فنون الدفاع عن النفس ، وما إلى ذلك … ولكن مع انقراض الإنسانية في عالم المستقبل ، لم يعد هناك أحد لمواصلة إرث هذه الفنون القتالية العظيمة. لا أحد ، باستثناء لو شنغ! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 375 chapters |  |  |  |
| chapter dates | PASS | 375 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://lavascans.com/.../01.jpg` (image/jpeg, 168741 bytes, 1250x1250) |  |  |  |
