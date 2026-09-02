# Extension Validation Report

- Extension: tachiyomi-ru.seimanga-v1.6.43
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6340120447386662351
- Source name: SeiManga
- Source language: ru
- Selected manga input: latest offset 0: Сидо: Восход солнца (`.../sido__voshod_solnca`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | Токийские мстители (`.../tokiiskie_mstiteli`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | Клинок зла (`.../klinok_zla`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 50 | Сидо: Восход солнца (`.../sido__voshod_solnca`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Тенкаичи — турнир сильнейших мастеров боевых искусств Японии (`.../tenkaichi___turnir_silneishih_masterov_boevyh_iskusstv_iaponii`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Сидо: Восход солнца (`.../sido__voshod_solnca`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Сидо: Восход солнца (`.../sido__voshod_solnca`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | 1 - 1 Камуи (`.../1 <redacted query values: mtr>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 50 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Сидо: Восход солнца, URL=`.../sido__voshod_solnca` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://sei.one-way.work/.../312.webp` (image/webp (encoding: lossy), 27932 bytes, 325x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sido__voshod_solnca` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://sei.one-way.work/.../312_o.jpg` (image/jpeg, 230597 bytes, 850x1168) |  |  |  |
| details author | PASS | Такахаси Цутому |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | манга, драма, история, сэйнэн, военные |  |  |  |
| details status | PASS | PUBLISHING_FINISHED (4) |  |  |  |
| details description | PASS | ★★✬☆☆ 5.0 (голосов: 1)<br>Пока транспортное судно «Камуи» возвращается в Японию, Кодама Юкимура, сын Сётаро Юкимуры, и другие пассажиры на борту оказываются в открытом море после того, как корабль тонет. Их спасает российский военный корабль, но японских выживших запирают в трюме. Смогут ли они освободиться и бежать из этой тюрьмы?<br>**Альтернативные названия**:<br>- Сидо: Восход солнца<br>- Sidooh: Sunrise<br>- 士道Sunrise<br>- Sidooh Sunrise<br>- 士道サンライズ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://sei.one-way.work/.../10_res.webp` (image/webp (encoding: lossy), 602688 bytes, 2200x1456) |  |  |  |
