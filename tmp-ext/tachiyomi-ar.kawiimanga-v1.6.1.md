# Extension Validation Report

- Extension: tachiyomi-ar.kawiimanga-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5037404094705788694
- Source name: Kawii Manga
- Source language: ar
- Selected manga input: popular offset 0: I Only Need the Duke's Child (`.../i-only-need-the-dukes-child`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | I Only Need the Duke's Child (`.../i-only-need-the-dukes-child`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | As Your Heart Leads You (`.../as-your-heart-leads-you`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Unofficial Campus Couple (`.../unofficia-campus-couple`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Pretty Trash (`.../pretty-trash`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I Only Need the Duke's Child (`.../i-only-need-the-dukes-child`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Only Need the Duke's Child (`.../i-only-need-the-dukes-child`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 26 | الفصل 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 38 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Only Need the Duke's Child, URL=`i-only-need-the-dukes-child` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga-cdn.kawaii-anime.com/.../cover.webp <redacted query values: v>` (image/webp (encoding: lossy), 89946 bytes, 512x741) |  |  |  |
| details identity | PASS | Details preserved selected URL `i-only-need-the-dukes-child` |  |  |  |
| details thumbnail URL | PASS | `https://manga-cdn.kawaii-anime.com/.../cover.webp <redacted query values: v>` |  |  |  |
| details author | PASS | Baek Dan |  |  |  |
| details artist | PASS | Roal |  |  |  |
| details genres | PASS | Manhwa, سفر بالزمن, رومانسي, دراما, خيال |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | «لو استطعت العودة إلى الماضي، لما أحببته أبدًا.»<br>بعد عودتها بالزمن، كان زواجها الثاني من زوجها السابق من أجل طفلهما فقط. على عكس حياتها السابقة، حيث كانت تتوق للحب، اختارت الزواج منه في هذه الحياة الثانية، التي حصلت عليها كمعجزة، مدفوعة بتصميمها الوحيد على لم شملها مع طفلها.<br>«الرجاء أن نبقى متزوجين لمدة عام واحد فقط.»<br>كان الثمن هو أنها ستتعاون معه لكشف أسرار حادثة قبل عشر سنوات، تمامًا كما أراد. اعتقدت أنهما زوجان بالاسم فقط، مرتبطان بعقد...<br>«ليس من الضروري إتمام الزواج في الليلة الأولى—»<br>«أريد ذلك.»<br>لقد كان مختلفًا عن حياتها السابقة. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 26 chapters |  |  |  |
| chapter dates | PASS | 26 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://manga-cdn.kawaii-anime.com/.../ad542614b399a1f5339e3db326724219.webp <redacted query values: md5 and expires>` (image/webp (encoding: lossy), 202666 bytes, 720x3691) |  |  |  |
