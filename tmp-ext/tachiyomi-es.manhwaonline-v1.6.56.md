# Extension Validation Report

- Extension: tachiyomi-es.manhwaonline-v1.6.56
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5414998368888208528
- Source name: ManhwaOnline
- Source language: es
- Selected manga input: popular offset 0: Jinx (`.../33475`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Jinx (`.../33475`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Una unión predestinada (`.../33861`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Pintor nocturno (`.../33554`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Kill My Love (`.../43462`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 25 | Love Jinx (`.../33647`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Jinx (`.../33475`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 116 | Capítulo 001 (`.../capitulo-001`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Jinx, URL=`33475` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 125/125 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 125/125 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhwa-online.com/.../Jinx-350x476.jpg` (image/jpeg, 39726 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `33475` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://manhwa-online.com/.../Jinx-193x278.jpg` (image/jpeg, 15961 bytes, 193x278) |  |  |  |
| details author | PASS | Mingwa |  |  |  |
| details artist | PASS | Mingwa |  |  |  |
| details genres | PASS | +18, Boys Love, Drama, Yaoi, Josei, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Jinx manhwa BL cuenta la historia de Kim Dan, un fisioterapeuta que ha vivido una vida llena de dificultades. Entre cuidar a su abuela enferma, ser acosado por prestamistas y enfrentar el rechazo de antiguos empleadores, su vida parece no tener respiro. Sin embargo, todo cambia cuando recibe una oferta inesperada: convertirse en el terapeuta personal de Joo Jaekyung, un famoso luchador de MMA. A cambio de una suma considerable de dinero, Kim Dan acepta el trabajo, pero pronto descubre que Jaekyung tiene exigencias fuera de lo común. Con un pasado marcado por la mala suerte, Kim Dan se enfrenta a una situación donde su necesidad financiera choca con la brutalidad y el deseo de su nuevo cliente.<br><br>Si te gustan las historias BL con dinámicas intensas y personajes complejos, te recomendamos también Love Remedy manhwa, otro manhwa que explora relaciones llenas de tensión y pasión.<br><br>Bl Jinx manhwa yaoi, una obra de Mingwa, fue lanzada en 2022 y publicada en Lezhin. La serie pertenece a los géneros de adulto, drama, maduro, smut, deportes y yaoi, explorando dinámicas de poder, deseo y lucha tanto dentro como fuera del ring. Actualmente, está licenciada en inglés por Lezhin US, así como en español, francés, alemán, chino tradicional y tailandés.<br><br>Si disfrutas de historias BL con personajes complejos y relaciones intensas, Jinx manhwa online es una excelente opción. En Manhwa Online encontrarás todos los capítulos completos y actualizados, asegurando una experiencia de lectura continua y gratuita.<br><br>Para quienes desean Jinx lectormanga, puedes acceder a los últimos capítulos de manera gratuita en Manhwa Online. Acompaña a Kim Dan mientras enfrenta los desafíos de trabajar para un hombre dominante y despiadado como Jaekyung. Si te gustan los manhwas BL con tramas intensas y personajes con pasados difíciles, leer completo Jinx manhwa BL es una excelente opción.<br><br>Nombres Alternativos: ジンクス, Vận xui, Джинкс, 징크스 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 116 chapters |  |  |  |
| chapter dates | LINT | 23 of 116 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=23 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 403 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
