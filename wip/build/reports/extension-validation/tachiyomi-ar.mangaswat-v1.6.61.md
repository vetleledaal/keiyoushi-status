# Extension Validation Report

- Extension: tachiyomi-ar.mangaswat-v1.6.61
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7657007209499352344
- Source name: MangaSwat
- Source language: ar
- Selected manga input: popular offset 0: Revenge of the Iron-Blooded Sword Hound (`.../1624038`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Revenge of the Iron-Blooded Sword Hound (`.../1624038`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Return of the Frozen Player (`.../615783`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | The Regressed Son of a Duke is an Assassin (`.../1702231`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | War of Extinction (`.../1702786`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Revenge of the Iron-Blooded Sword Hound (`.../1624038`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Revenge of the Iron-Blooded Sword Hound (`.../1624038`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 186 | 01  FREE (`.../%d8%a7%d9%84%d9%81%d8%b5%d9%84-01-%d9%85%d9%86-revenge-of-the-iron-blooded-sword-hound`) |  | 1-10s |
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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Revenge of the Iron-Blooded Sword Hound, URL=`1624038` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://meshmanga.com/.../e0346-0d4df-41cb9-crop-c0-5__0-5-800x1200-70.webp` (image/webp (encoding: lossy), 69104 bytes, 800x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `1624038` |  |  |  |
| details thumbnail URL | PASS | `https://meshmanga.com/.../e0346-0d4df-41cb9-crop-c0-5__0-5-800x1200-70.webp` |  |  |  |
| details author | PASS | I Stepped On Lego |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | مغامرات, فنون قتالية, خيال, أكشن, إعادة إحياء |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | كنتُ كلب عائلة صيد عائلة باسكرفيل، فيكير. رغم ذلك كوفئ ولائي بتلويث دمائي لنصل المقصلة. "لن أعيش حياة كلب الصيد الذي قُتل بعد القبض على الفريسة بعد الآن" بدلًا من الموت، تنتظرني مفاجأة غير متوقعة. لمعت عيون فيكير باللون الأحمر الدموي بينما يسن أنيابه في الظلام. "انتظرني يا هوجو. سأقطع رقبتك هذه المرة" حان وقت تنفيذ كلب الصيد لانتقامة الدموي من مالكه. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 154 name, chapter 155 name, chapter 156 name, chapter 157 name, chapter 160 name, chapter 161 name, chapter 162 name, chapter 163 name, chapter 164 name, chapter 165 name, chapter 166 name, chapter 167 name, chapter 169 name, chapter 172 name, chapter 173 name, chapter 174 name, chapter 175 name, chapter 180 name, chapter 182 name, chapter 184 name, chapter 185 name, chapter 186 name |  |  |  |
| chapters | PASS | 186 chapters |  |  |  |
| chapter dates | PASS | 186 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://meshmanga.com/.../001-159.webp` (image/webp (encoding: lossy), 285426 bytes, 720x6143) |  |  |  |
