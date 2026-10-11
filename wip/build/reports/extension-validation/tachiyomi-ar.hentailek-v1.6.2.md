# Extension Validation Report

- Extension: tachiyomi-ar.hentailek-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1258840903039841012
- Source name: هنتاي ليك
- Source language: ar
- Selected manga input: popular offset 0: Beautiful Days (`.../beautiful-days`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Beautiful Days (`.../beautiful-days`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 21 | Love Factory (`.../love-factory`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Beautiful Days (`.../beautiful-days`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 21 | Live-In Son-in-Law (`.../live-in-son-in-law`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Beautiful Days (`.../beautiful-days`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Beautiful Days (`.../beautiful-days`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 91 | الفصل 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 79 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Beautiful Days, URL=`.../beautiful-days` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 91/91 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 91/91 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://0096423.xyz/.../cover-thumb.webp` (image/webp (encoding: lossy), 18460 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../beautiful-days` |  |  |  |
| details thumbnail URL | PASS | `https://0096423.xyz/.../cover-thumb.webp` |  |  |  |
| details author | PASS | Yuwol |  |  |  |
| details artist | PASS | Nunnya |  |  |  |
| details genres | PASS | مانهوا |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | في عالمٍ يخفي الناس فيه ظروفهم ورغباتهم خلف ستارٍ من الصمت، تتشابك المصائر وتتعرّى الأسرار في أجواءٍ مشحونة بالتوتر والشهوة. كل شخصية تحمل بداخلها جرحاً أو رغبةً مكبوتة، تنتظر اللحظة التي تتفجّر فيها لتُزهِر وسط ظلام الواقع. "سأكشف كل جزءٍ منك—جلدك، عرقك، رائحتك، وأنفاسك المتقطعة"... كلماتٌ تختصر جوهر القصة حيث لا مكان للأقنعة حين تشتعل الرغبات. مانهوا Beautiful Days هنتاي تقدّم سرداً ناضجاً يتناول التناقض بين المظهر المخادع والرغبة الدفينة، بأسلوبٍ يجمع بين الحسية والعمق النفسي. رسمٌ معبّر وقصةٌ تجرّب القارئ نحو زوايا النفس البشرية المظلمة، حيث الضعف والقوة وجهان لعملةٍ واحدة. تجربة قراءة مثيرة للكبار تلامس حدود الشغف والانكشاف. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 91 chapters |  |  |  |
| chapter dates | PASS | 91 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 79 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://0096423.xyz/.../001.webp` (image/webp (encoding: lossy), 87050 bytes, 720x4714) |  |  |  |
