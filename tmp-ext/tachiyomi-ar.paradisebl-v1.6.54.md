# Extension Validation Report

- Extension: tachiyomi-ar.paradisebl-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4957859168133378262
- Source name: Paradise BL
- Source language: ar
- Selected manga input: popular offset 0: Kiss me, Liar (`.../2809`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Kiss me, Liar (`.../2809`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | To you in my hand (`.../2815`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | In good faith (`.../3087`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Plaything (`.../2817`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kiss me, Liar (`.../2809`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kiss me, Liar (`.../2809`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 80 | 1 الفصل (`.../1-%d8%a7%d9%84%d9%81%d8%b5%d9%84`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kiss me, Liar, URL=`2809` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://paradise-bl.com/.../%D8%A8%D8%AF%D9%88%D9%86-%D8%A7%D8%B3%D9%855427_20250127154513.png` (image/png, 983669 bytes, 720x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `2809` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Zig |  |  |  |
| details artist | PASS | Zig |  |  |  |
| details genres | PASS | اوميغافيروس, بذيء, دراما, رومنسي, ويبتون, ياوي |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | كسكرتير، هل هناك أي شيء أكثر مأساوي من الإعجاب برئيسك في العمل؟<br><br>والأكثر من ذلك، أن هذا الرئيس هو ألفا معقد في أي عصر لا يزال يمارس التمييز الجنسي ويرفض ذكر أوميغا! عندما اعتقد يون وو أن حبه السري المرير سينتهي سدى، اكتشف أن الرئيس الذي كان ينظر إليه بازدراء يعتني بكل شيء سرًا من أجله. بعد دورة الحرارة، لم يظهر مقاومة فحسب، بل جعل جسده ساخنًا جدًا أيضاً… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 80 chapters |  |  |  |
| chapter dates | LINT | All 80 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=80 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://paradise-bl.com/.../%D9%82%D8%A8%D9%84%D9%86%D9%8A-%D8%A7%D9%94%D9%8A%D9%87%D8%A7-%D8%A7%D9%84%D9%83%D8%A7%D8%B0%D8%A8-%D8%A7%D9%84%D9%81%D8%B5%D9%84-%D9%A1-01.jpg` (image/jpeg, 1212492 bytes, 2612x6945) |  |  |  |
