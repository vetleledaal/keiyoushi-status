# Extension Validation Report

- Extension: tachiyomi-ru.mangalib-v1.4.117
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 4
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6111047689498497237
- Source name: MangaLib
- Source language: ru
- Selected manga input: latest offset 0: Why You Shouldn't Enter a Haunted House (`.../217316--hyung-ga-e-deul-eogamyeon-andoeneun-iyu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 60 | Solo Leveling (`.../7580--i-alone-level-up`) |  | 10s+ |
| popular_next | `fetchPopularManga(2)` | success | 60 | The Reason I Decided to Die (`.../106336--naega-juggilo-gyeolsimhan-geos-eun`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 15 | Why You Shouldn't Enter a Haunted House (`.../217316--hyung-ga-e-deul-eogamyeon-andoeneun-iyu`) |  | 10s+ |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | Death God (`.../142018--death-god`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Why You Shouldn't Enter a Haunted House (`.../217316--hyung-ga-e-deul-eogamyeon-andoeneun-iyu`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Why You Shouldn't Enter a Haunted House (`.../217316--hyung-ga-e-deul-eogamyeon-andoeneun-iyu`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 77 | Том 1. Глава 1 - Подвал (`.../chapter <redacted query values: , volume, and number>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Why You Shouldn't Enter a Haunted House, URL=`.../217316--hyung-ga-e-deul-eogamyeon-andoeneun-iyu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 151/151 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 151/151 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.cdnlibs.org/.../fc2d18e8-1a57-4f6a-a979-6789ebfccfe1.jpg` (image/jpeg, 81161 bytes, 375x567) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../217316--hyung-ga-e-deul-eogamyeon-andoeneun-iyu` |  |  |  |
| details thumbnail URL | PASS | `https://cover.cdnlibs.org/.../fc2d18e8-1a57-4f6a-a979-6789ebfccfe1.jpg` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Манхва, 18+, Драма, Мистика, Повседневность, Психология, Трагедия, Триллер, Ужасы, Фантастика, Монстры, Призраки / Духи, Дружба, Злые духи, ГГ мужчина |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Причина, по которой нельзя заходить в заброшенные дома<br>★★★★★ 9.54 (голосов: 169)<br>Альтернативные названия:<br>흉가에 들어가면 안되는 이유<br><br>Мир главного героя, Ли Хёна, наполнен ужасными призраками и чёрными сгустками, оставленными душами умерших. Чтобы жить обычной жизнью, он старается делать вид, что не замечает сверхъестественное.Однако всё меняется, когда на его пути появляется странный парень — Чхве Джесын, , блогер, который намеренно исследует заброшенные дома с привидениями. Вместе они оказываются в опасных местах, где грань между жизнью и смертью стирается... Сумеют ли они выбраться живыми?<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 77 chapters |  |  |  |
| chapter dates | PASS | 77 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | FAIL | 16 of 17 pages have invalid URLs: page 2: url=`.../6ac1cdc0-0815-404e-a6d4-cdd8fcdd36c8.jpg` (protocol-relative URL), page 3: url=`.../d60ca181-243c-40a0-83ce-ab3d30a3887c.jpg` (protocol-relative URL), page 4: url=`.../d17acf2e-d307-4e83-b988-1b0ed1a5d815.jpg` (protocol-relative URL), page 5: url=`.../f128a48c-63e0-4ae3-b219-cffd42d99398.jpg` (protocol-relative URL), page 6: url=`.../2fd82a99-2f52-4334-9af8-e2b5797461cd.jpg` (protocol-relative URL), and 11 more | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img3.cdnlibs.org/.../965081a8-6b34-4370-9569-468ecb5de1dd.jpg` (image/jpeg, 775168 bytes, 690x13872) |  |  |  |
