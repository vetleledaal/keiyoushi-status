# Extension Validation Report

- Extension: tachiyomi-ru.mangapoisk-v1.6.16
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4092015241327675443
- Source name: MangaPoisk
- Source language: ru
- Selected manga input: popular offset 0: О моём перерождении в слизь (`.../o-moem-pererozhdenii-v-sliz-abs361N`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | О моём перерождении в слизь (`.../o-moem-pererozhdenii-v-sliz-abs361N`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | Профессор академии под прикрытием (`.../i-got-a-fake-job-at-the-academy-abs3dEE`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | Акула (`.../shark`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Возвращение Тёмного Мага на военную службу (`.../the-dark-mage-s-return-to-enlistment`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 5 | О моём перерождении в слизь (`.../o-moem-pererozhdenii-v-sliz-abs361N`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | О моём перерождении в слизь (`.../o-moem-pererozhdenii-v-sliz-abs361N`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 148 | Том 1 Глава 1 Смерть... и перерождение. (`.../1-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 49 |  |  | <1s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=О моём перерождении в слизь, URL=`.../o-moem-pererozhdenii-v-sliz-abs361N` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 165/165 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 165/165 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static2.mangapoisk.me/.../lYQrSCAmhtCzZAdgQ1b0ri3zuoQ47zxkCuSp6tRt_mini.jpg` (image/jpeg, 33672 bytes, 280x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../o-moem-pererozhdenii-v-sliz-abs361N` |  |  |  |
| details thumbnail URL | PASS | `https://static2.mangapoisk.me/.../lYQrSCAmhtCzZAdgQ1b0ri3zuoQ47zxkCuSp6tRt_mini.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | приключения, романтика, боевик, комедия, драма, фэнтези, сэйнэн, героическое фэнтези, игра, гендерная интрига |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Трагические случаи всегда приходят неожиданно. Казалось бы, на улице обычный день и ничего не предвещает беды, однако судьба нередко дарует неприятные "сюрпризы". В один из рядовых дней, на самой обычной улице произошел трагический инцидент. Грабитель убил зрелого мужчину. Пострадавшему было тридцать семь лет. Этот случай мог бы остаться незамеченным в криминальной хронике, однако он обрел совсем уж неожиданной поворот событий: мужчина перевоплощается в слизь, живущую во вселенной Фентези. Но чего сможет добиться эта разумная субстанция в новом мире и какие фантастические события ждут читателя далее? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 148 chapters |  |  |  |
| chapter dates | LINT | 29 of 148 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=29 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 49 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://static2.mangapoisk.me/.../vB2Ts9yfWjUXk5LTgozNIdgYXb1SMsGxjpmiS24Y.jpg` (image/jpeg, 231502 bytes, 835x1200) |  |  |  |
