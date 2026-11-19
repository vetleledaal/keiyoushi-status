# Extension Validation Report

- Extension: tachiyomi-ar.procomic-v1.6.11
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8891921907305143070
- Source name: ProComic
- Source language: ar
- Selected manga input: latest offset 0: Shut Up, Evil Dragon! I Don’t Want to Raise a Child With You Anymore (`.../44`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | After Becoming Financially Free, They Offered Their Loyalty (`.../38`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 12 | Reborn as the Strongest Wu Dalang in the Water Margin World (`.../551`) |  | 10s+ |
| latest | `getLatestUpdates(1)` | success | 1 | Shut Up, Evil Dragon! I Don’t Want to Raise a Child With You Anymore (`.../44`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 8 | I Am a Living Beast in the World of Cultivating Immortals (`.../125`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 9 | Shut Up, Evil Dragon! I Don’t Want to Raise a Child With You Anymore (`.../44`) |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Shut Up, Evil Dragon! I Don’t Want to Raise a Child With You Anymore (`.../44`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 115 | ‏الفصل Extra ‏- اللعب مع ميون (`.../50565`) |  | 10s+ |
| pages | `getPageList(chapter)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 1 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Shut Up, Evil Dragon! I Don’t Want to Raise a Child With You Anymore, URL=`44` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 42/42 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 42/42 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://app.procomic.pro/.../1780058929699-yqvjh6n21l.avif` (image/avif (format: avif), 201655 bytes, 600x750) |  |  |  |
| details identity | PASS | Details preserved selected URL `44` |  |  |  |
| details thumbnail URL | PASS | `https://app.procomic.pro/.../1780058929699-yqvjh6n21l.avif` |  |  |  |
| details author | PASS | Milkshake Tail Sauce, 菠萝包轻小说 |  |  |  |
| details artist | PASS | SF Light Novels, 菠萝包轻小说 |  |  |  |
| details genres | PASS | Manhua, Chinese, 2024 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | بعد هزيمته وأسره، أصبح قاتل التنين ليون أسيرًا لملكة التنين الفضي. مع وعيه بالموت، استخدم السحر المحرم للعن الملكة، ولكن بشكل غير متوقع، فقدت الملكة السيطرة. لقد اعتقد أن هذا سيجعل الملكة تعيش في عار لبقية حياتها، وسيكون الأمر يستحق مهمة قاتل التنين. لكن بعد عامين، عندما فتح ليون عينيه، كانت بجانبه فتاة تنين صغيرة ذات ذيل…<br><br>عناوين بديلة<br>- 闭嘴恶龙我不想再跟你带孩子了<br>- Bi Zui E Long Wo Buxiang Zai Gen Ni Dai Haizile<br>- Bì Zuǐ È Lóng Wǒ Bùxiǎng Zài Gēn Nǐ Dài Háizile<br>- Câm Miệng Đi Ác Long, Ta Không Muốn Trông Trẻ Với Ngươi Nữa!<br>- Shut Up! Evil Dragon! I Don't Want to Raise Any Children With You Anymore<br>- Shut Up, Evil Dragon - I'm Not Having Another Kid With You!<br>- Shut Up, Evil Dragon! I Don't Want to Take a Baby With You Anymore<br>- Shut Up, Malevolent Dragon! I Don't Want to Have Any More Children With You<br>- 元ドラゴンスレイヤーは専業パパになる |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 9 name, chapter 17 name, chapter 18 name, chapter 20 name, chapter 22 name |  |  |  |
| chapters | PASS | 115 chapters |  |  |  |
| chapter dates | PASS | 115 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Timed out waiting for 30000 ms |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
