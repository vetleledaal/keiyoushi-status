# Extension Validation Report

- Extension: tachiyomi-ar.manga3asq-v1.6.58
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1073624495230267708
- Source name: مانجا العاشق
- Source language: ar
- Selected manga input: latest offset 0: Kingdom (WAN) (`.../16482`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 21 | One Piece (`.../1965`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 21 | Diamond no Ace Act II (`.../1999`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 21 | Kingdom (WAN) (`.../16482`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 21 | Baki Rahen (`.../20735`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kingdom (WAN) (`.../16482`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kingdom (WAN) (`.../16482`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 385 | 1 - اليتيم (`.../1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 55 |  |  | 1-10s |

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
| popular listing | PASS | 21 entries |  |  |  |
| latest listing | PASS | 21 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kingdom (WAN), URL=`16482` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | FAIL | Invalid manga: popular_next entry 7: title=<blank>, URL=`16564` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | UNUSUAL | 82/85 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://3asq.online/.../0cover-350x476.jpg` (image/jpeg, 81059 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `16482` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://3asq.online/.../0cover.jpg` (image/jpeg, 3387949 bytes, 1440x2048) |  |  |  |
| details author | PASS | ياسوهيسا هارا |  |  |  |
| details artist | PASS | ياسوهيسا هارا |  |  |  |
| details genres | PASS | أكشن, تاريخ, حرب, دراما, سينين, عسكرية, عنف, فنون قتالية, مأساة, WANteam |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | بعد مرور القرون والقرون على إنقضاء العصر القديم، وكذلك قد ولى زمن القديسين وانتهى، في وقت أطلق فيه الرجال العنان لرغباتهم؛ إنه عهد حرب الخمسمائة عام الكبرى أي حقبة الممالك المتناحرة. وتدور أحداث المانجا حول فتى صغير يُدعى شين يطمح للغدو جنرالا عظيما فما هي العقبات التي سيواجهها وكم من الدماء سينزف من أجل تحقيق حلمه. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 385 chapters |  |  |  |
| chapter dates | LINT | 1 of 385 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://3asq.online/.../0.jpg` (image/jpeg, 2482054 bytes, 1920x2724) |  |  |  |
