# Extension Validation Report

- Extension: tachiyomi-es.leercapitulo-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5621901596522308538
- Source name: LeerCapitulo
- Source language: es
- Selected manga input: popular offset 0: Subiendo De Nivel 10.000 Años En el Futuro. (`.../subiendo-de-nivel-10-000-anos-en-el-futuro`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Subiendo De Nivel 10.000 Años En el Futuro. (`.../subiendo-de-nivel-10-000-anos-en-el-futuro`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 90 | The Solitary Girl, and What We Do in Her Room (`.../the-solitary-girl-and-what-we-do-in-her-room`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Subiendo De Nivel 10.000 Años En el Futuro. (`.../subiendo-de-nivel-10-000-anos-en-el-futuro`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Subiendo De Nivel 10.000 Años En el Futuro. (`.../subiendo-de-nivel-10-000-anos-en-el-futuro`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 390 | Capitulo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 68 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 90 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Subiendo De Nivel 10.000 Años En el Futuro., URL=`.../subiendo-de-nivel-10-000-anos-en-el-futuro` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 115/115 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 115/115 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.leercapitulo.co/.../e9d13400c09e699bec77b7570ab396.jpg <redacted query values: v1791574044755>` (image/jpeg, 34662 bytes, 200x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../subiendo-de-nivel-10-000-anos-en-el-futuro` |  |  |  |
| details thumbnail URL | PASS | `https://www.leercapitulo.co/.../e9d13400c09e699bec77b7570ab396.jpg <redacted query values: v1791574044755>` |  |  |  |
| details author | PASS | Kuaikan Comics (常盘勇者), Lie Ren, Mei Yue Yi Geng |  |  |  |
| details artist | PASS | Kuaikan Comics (常盘勇者), Ruo Zhi Ji Ji, Ji Zhi Wa Wa |  |  |  |
| details genres | PASS | Action, Drama, Fantasy, Wuxia, Shounen, Time Travel, Martial Arts, Monsters |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Al principio del dao marcial, terroríficas bestias invadieron el mundo y los artistas marciales humanos fueron derrotados.<br>Lu Sheng viaja en el tiempo y entra en el mundo 10.000 años en el futuro en su sueño...<br>Diez mil años después, las técnicas básicas de refinamiento corporal han sido renovadas para ser miles de veces más efectivas de lo que son ahora.<br>Técnicas de respiración, remedios para refinar el cuerpo y textos sagrados sobre artes marciales.<br>Diez mil años después del Dao Marcial, la humanidad se ha extinguido.<br>La civilización marcial que había florecido hasta su apogeo no tenía a nadie que la heredara y ¡Lu Sheng, es la única esperanza!<br><br>Alt name(s): 高武：登陆未来一万年 · Gao Wu: Denglu Weilai Yi Wan Nian · Cao Võ: Hạ Cánh Đến Một Vạn Năm Sau · Subiendo de nivel 10.000 años en el futuro · Martial Art: Future's Ten Thousand Years · Subindo de Nível no Futuro · Apex Future Martial Arts · Logging 10,000 Years into the Future · Logado 10000 Anos No Futuro · Gāo Wǔ: Dēnglù Wèilái Yī Wàn Nián · Leveling Up into the Future · Log into the Future · Level-up in the Future · Cao Võ Vạn Năm Tiến Hóa · Naik Level Menuju Masa Depan · Evoluindo para o Futuro · Landing 10,000 Years Into the Future · Я прокачиваюсь во сне, убивая монстров · アクセス：1万年後の未来に · 만년 후 미래에서 레벨업 · Iniciando sesión en 10.000 años en el futuro · Iniciando sesion en 10,000 años en el futuro · Level Up In The Future · Subiendo de nivel 10.000 años en el futuro / 高武：登陆未来一万年 / Level Up In The Future / Subiendo de nivel 10.000 años en el futuro · Subiendo de nivel 10,000 años en el futuro · 000 años en el futuro · 登录未来一万年 · Denglu Weilai Yi Wan Nian · Iniciando sesión en 10,000 años en el futuro · Iniciando sesion en 10 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 390 chapters |  |  |  |
| chapter dates | PASS | 390 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 68 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://es1s11-95168.t34798ndc.com/.../U5-5AATT4AT5wV5A.O0CJ.webp` (image/webp (encoding: lossy), 156930 bytes, 1911x1280) |  |  |  |
