# Extension Validation Report

- Extension: tachiyomi-ru.desu-v1.6.34
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6684416167758830305
- Source name: Desu
- Source language: ru
- Selected manga input: popular offset 0: Brother, am I cute? (`.../5904`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Brother, am I cute? (`.../5904`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | I have a golden palace in a post-apocalyptic world (`.../4217`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Brother, am I cute? (`.../5904`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | I have a golden palace in a post-apocalyptic world (`.../4217`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | Brother, am I cute? (`.../5904`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Brother, am I cute? (`.../5904`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 97 | 1. Глава 1 (`.../487377`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Brother, am I cute?, URL=`.../5904` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.desu.uno/.../5904.jpg <redacted query values: 1705164963>` (image/jpeg, 80014 bytes, 375x525) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../5904` |  |  |  |
| details thumbnail URL | PASS | `https://static.desu.uno/.../5904.jpg <redacted query values: 1705164963>` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Манхва, unrated, Драма, Повседневность, Приключения, Фэнтези, Веб, В цвете, ГГ мужчина, Дружба, Умный ГГ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Брат, я милый?<br>★★★★☆ 7.6 (голосов: 5)<br>Альтернативные названия:<br>형아, 나 귀엽지? / Брат, я милашка?<br><br>Ши Хёк и его младший брат Ши Ха, разница в возрасте между которыми составляет 20 лет, потеряли родителей в результате внезапной автомобильной аварии.<br><br>"Ааа" - только так разговаривал Ши Ха.<br><br>На похоронах родственники без умолку болтали о неприятных вещах:<br>"Что они двое будут делать? Кто возьмет на себя ответственность?"<br>"Уф. Ши Хёк учится в университете. Как же он будет заботиться о младшем брате?"<br>"Они получили деньги?"<br><br>В разгар хаоса Ши Ха внезапно начал рыдать и, ко всеобщему удивлению, произнес свое первое слово:<br>"Блат! Блат! Уваааа!"<br><br>Не папа, не мама, а именно брат.<br>Ши Хёк медленно подошел и обнял братика.<br><br>"Я буду защищать тебя." |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 97 chapters |  |  |  |
| chapter dates | PASS | 97 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img2.desu.uno/.../brother_am_i_cute_vol01_ch001_p001.jpg <redacted query values: 1705164988>` (image/jpeg, 1483261 bytes, 720x17395) |  |  |  |
