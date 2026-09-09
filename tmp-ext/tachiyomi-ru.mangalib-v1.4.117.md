# Extension Validation Report

- Extension: tachiyomi-ru.mangalib-v1.4.117
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 3
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: libgroup
- Source ID: 6111047689498497237
- Source name: MangaLib
- Source language: ru
- Selected manga input: latest offset 0: I Became the First Prince (`.../79757--mangnani-1wangjaga-doeeossda-webtoon`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 60 | Solo Leveling (`.../7580--i-alone-level-up`) |  | 10s+ |
| popular_next | `fetchPopularManga(2)` | success | 60 | The Reason I Decided to Die (`.../106336--naega-juggilo-gyeolsimhan-geos-eun`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 15 | I Became the First Prince (`.../79757--mangnani-1wangjaga-doeeossda-webtoon`) |  | 10s+ |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | wolseuteuliteu cheonjaeui sihanbu tujabeob (`.../270624--wolseuteuliteu-cheonjaeui-sihanbu-tujabeob`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | I Became the First Prince (`.../79757--mangnani-1wangjaga-doeeossda-webtoon`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | I Became the First Prince (`.../79757--mangnani-1wangjaga-doeeossda-webtoon`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 46 | Том 1. Глава 0 - Пролог (`.../chapter <redacted query values: , volume, and number>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Became the First Prince, URL=`.../79757--mangnani-1wangjaga-doeeossda-webtoon` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 151/151 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 151/151 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.cdnlibs.org/.../8b0f912b-8faf-4a19-a2bd-f154b1d76170.jpg` (image/jpeg, 73919 bytes, 375x536) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../79757--mangnani-1wangjaga-doeeossda-webtoon` |  |  |  |
| details thumbnail URL | PASS | `https://cover.cdnlibs.org/.../8b0f912b-8faf-4a19-a2bd-f154b1d76170.jpg` |  |  |  |
| details author | PASS | Glumph |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Манхва, 16+, Боевик, Боевые искусства, История, Сёнэн, Фантастика, Фэнтези, Исекай, Реинкарнация, Магия, Средневековье, Бои на мечах, Борьба за власть, Волшебники / маги, ГГ имба, ГГ мужчина, Яндере |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Меч стал первым принцем<br>★★★★✬ 8.97 (голосов: 416)<br>Альтернативные названия:<br>Меч стал первым принцем-отморозком / Я стал первородным принцем-отморозком / 망나니 1왕자가 되었다<br><br>После многочисленных перерождений я оказался мечом, прожив сотни лет в решении чужих проблем. Однажды, совершенно неожиданно, я оказался в теле пятнадцатилетнего озорного наследного принца. «Я стольких уже воспитал». Среди моих воспитанников есть и непобедимый великий рыцарь, и драконоборец, одолевший Безумного Дракона, и король наёмников. Все эти великие личности получили наставления от меня. Я, магический меч Грухон, теперь, обитающий в теле первородного принца, собираюсь начать новую эпопею, которая станет мифом для потомков.<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 46 chapters |  |  |  |
| chapter dates | PASS | 46 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | FAIL | 10 of 11 pages have invalid URLs: page 2: url=`.../31efd508-6bcf-4023-80ff-daad45ec9613.jpg` (protocol-relative URL), page 3: url=`.../a608eff1-a0d5-4b05-8d40-affb2aac50a6.jpg` (protocol-relative URL), page 4: url=`.../b5e6e0e2-871c-43e9-8e46-a4c206746201.jpg` (protocol-relative URL), page 5: url=`.../a9630a39-d80b-496a-9c59-c302706b1537.jpg` (protocol-relative URL), page 6: url=`.../e03458f5-7d03-4f78-9022-77f8f2a30750.jpg` (protocol-relative URL), and 5 more | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img3.cdnlibs.org/.../61a42e18-b741-4719-90b3-271612f13859.jpg` (image/jpeg, 853243 bytes, 800x14305) |  |  |  |
